package net.telus.zmclient.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zimbra.wsdl.zimbraservice.ZcsAdminPortType;

import zimbra.AccountBy;
import zimbra.AccountSelector;
import zimbraadmin.Attr;
import zimbraadmin.CacheEntryBy;
import zimbraadmin.CacheEntrySelector;
import zimbraadmin.CacheSelector;
import zimbraadmin.FlushCacheRequest;
import zimbraadmin.FlushCacheResponse;
import zimbraadmin.GetAccountInfoRequest;
import zimbraadmin.GetAccountInfoResponse;

@Controller
@RequestMapping("/ZmServlet")
public class MainController {

	protected static Logger logger = Logger.getLogger("controller");

	@Resource(name="zimbraJaxProxyService")
	private ZcsAdminPortType zimbraJaxProxyService;

	@RequestMapping(method = RequestMethod.GET)
	public String doAction(@RequestParam(value = "name") String name,  Model model) {
	//public @ResponseBody Model doAction(@RequestParam(value = "name") String name,  Model model) {
		logger.debug("Received request to flush zimbra password cache");

		AccountSelector zmAccountSelector = new AccountSelector();
		zmAccountSelector.setBy(AccountBy.NAME);
		zmAccountSelector.setValue(name);
		GetAccountInfoRequest zmAccountInfoRequest = new GetAccountInfoRequest();
		zmAccountInfoRequest.setAccount(zmAccountSelector);

		GetAccountInfoResponse zmAccountInfoResponse = zimbraJaxProxyService.getAccountInfoRequest(zmAccountInfoRequest);

		List<Attr> zmAttrs = zmAccountInfoResponse.getA();
		String zmMailHost = null;
		for (Attr attr : zmAttrs) {
			if (attr.getN().equalsIgnoreCase("zimbraMailHost")) {
				zmMailHost = attr.getValue();
			}
		}

		CacheEntrySelector zmCacheEntrySelector = new CacheEntrySelector();
		zmCacheEntrySelector.setBy(CacheEntryBy.NAME);
		zmCacheEntrySelector.setValue(zmMailHost);
		CacheSelector zmCacheSelector = new CacheSelector();
		zmCacheSelector.setType("server");
		//zmCacheSelector.setAllServers(true);
		zmCacheSelector.getEntry().add(zmCacheEntrySelector);
		FlushCacheRequest zmFlushCacheRequest = new FlushCacheRequest();
		zmFlushCacheRequest.setCache(zmCacheSelector);

		FlushCacheResponse zmFlushCacheResponse = zimbraJaxProxyService.flushCacheRequest(zmFlushCacheRequest);

		model.addAttribute("response", zmAccountInfoResponse);
		//model.addAttribute("response", zmAccountSelector);
		return "response";
	}

}
