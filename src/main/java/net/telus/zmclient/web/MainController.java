package net.telus.zmclient.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.telus.zimbra.ws.client.ZcsAdminPortType;
import zimbra.AccountBy;
import zimbra.AccountSelector;
import zimbraadmin.Attr;
import zimbraadmin.AuthRequest;
import zimbraadmin.AuthResponse;
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
	private ZcsAdminPortType zimbraAdminPort;
	
	private @Value("${zimbra.admin.username}") String adminName;// = "pwm-notification@telus.net";
	private @Value("${zimbra.admin.password}") String adminPassword;// = "pwmsmtp";

	@RequestMapping(method = RequestMethod.GET)
	public String doAction(@RequestParam(value = "name") String name,  Model model) 
	{
		logger.debug("Received request to flush zimbra password cache");

		logger.debug("Getting auth token for: username: " + adminName);
		AuthRequest zmAuthRequest = new AuthRequest();
		zmAuthRequest.setPersistAuthTokenCookie(true);
		zmAuthRequest.setName(adminName);
		zmAuthRequest.setPassword(adminPassword);
		AuthResponse zmAuthResponse = zimbraAdminPort.authRequest(zmAuthRequest);
		String authToken = zmAuthResponse.getAuthToken();
		Map<String,Object> requestContext = ((BindingProvider) zimbraAdminPort).getRequestContext();
		requestContext.put("authToken", authToken);
		
		logger.debug("Starting GetAccountInfoRequest for: " + name);
		AccountSelector zmAccountSelector = new AccountSelector();
		zmAccountSelector.setBy(AccountBy.NAME);
		zmAccountSelector.setValue(name);
		
		GetAccountInfoRequest zmAccountInfoRequest = new GetAccountInfoRequest();
		zmAccountInfoRequest.setAccount(zmAccountSelector);

		GetAccountInfoResponse zmAccountInfoResponse = zimbraAdminPort.getAccountInfoRequest(zmAccountInfoRequest);

		List<Attr> zmAttrs = zmAccountInfoResponse.getA();
		String zmMailHost = null;
		for (Attr attr : zmAttrs) {
			if (attr.getN().equalsIgnoreCase("zimbraMailHost")) {
				zmMailHost = attr.getValue();
				logger.debug("Got zimbraMailHost: " + zmMailHost);
			}
		}

		logger.debug("Starting FlushCache for: " + name + " on zimbraMailHost: " + zmMailHost);
		CacheEntrySelector zmCacheEntrySelector = new CacheEntrySelector();
		zmCacheEntrySelector.setBy(CacheEntryBy.NAME);
		zmCacheEntrySelector.setValue(zmMailHost);
		CacheSelector zmCacheSelector = new CacheSelector();
		zmCacheSelector.setType("server");
		//zmCacheSelector.setAllServers(true);
		zmCacheSelector.getEntry().add(zmCacheEntrySelector);
		FlushCacheRequest zmFlushCacheRequest = new FlushCacheRequest();
		zmFlushCacheRequest.setCache(zmCacheSelector);

		FlushCacheResponse zmFlushCacheResponse = zimbraAdminPort.flushCacheRequest(zmFlushCacheRequest);

		logger.debug("Done flushing password cache for: " + name + " (Response): " + zmFlushCacheResponse.toString());
		model.addAttribute("response", zmAccountInfoResponse);
		
		return "response";
	}
}
