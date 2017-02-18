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
import zimbraadmin.GetAccountInfoRequest;
import zimbraadmin.GetAccountInfoResponse;

@Controller
@RequestMapping("/ZmServlet")
public class MainController {

	protected static Logger logger = Logger.getLogger("controller");

	@Resource(name="zimbraJaxProxyService")
	private ZcsAdminPortType zimbraAdminPort;
	
	private @Value("${zimbra.admin.username}") String adminName;
	private @Value("${zimbra.admin.password}") String adminPassword;

	@RequestMapping(method = RequestMethod.GET)
	public String doAction(@RequestParam(value = "name") String name,  Model model) 
	{
		logger.debug("Received request to flush zimbra password cache");
		Map<String,Object> requestContext = ((BindingProvider) zimbraAdminPort).getRequestContext();
		if (requestContext.get("authToken") != null) {
			logger.debug("Removing old authToken in requestContext");
			requestContext.remove("authToken");
		}
		
		logger.debug("Getting auth token for admin user: " + adminName);
		AuthRequest zmAuthRequest = new AuthRequest();
		zmAuthRequest.setPersistAuthTokenCookie(false);
		zmAuthRequest.setName(adminName);
		zmAuthRequest.setPassword(adminPassword);
		AuthResponse zmAuthResponse = zimbraAdminPort.authRequest(zmAuthRequest);
		String authToken = zmAuthResponse.getAuthToken();
		requestContext.put("authToken", authToken);
		
		logger.debug("Starting GetAccountInfoRequest for: " + name);
		AccountSelector zmAccountSelector = new AccountSelector();
		zmAccountSelector.setBy(AccountBy.NAME);
		zmAccountSelector.setValue(name);
		GetAccountInfoRequest zmAccountInfoRequest = new GetAccountInfoRequest();
		zmAccountInfoRequest.setAccount(zmAccountSelector);
		String zmMailHost = null;
		GetAccountInfoResponse zmAccountInfoResponse = zimbraAdminPort.getAccountInfoRequest(zmAccountInfoRequest);//check for null here
		if (zmAccountInfoResponse != null) {
			List<Attr> zmAttrs = zmAccountInfoResponse.getA();
			for (Attr attr : zmAttrs) {
				logger.debug("Attr: " + attr.getN() + ", Value: " + attr.getValue());
				if (attr.getN().equalsIgnoreCase("zimbraMailHost")) {
					zmMailHost = attr.getValue();//use this value to create another jaxWsProxyBean with this server as endpoint
					logger.debug("Got zimbraMailHost: " + zmMailHost);
					break;
				}
			}
		}

		logger.debug("Starting FlushCache for: " + name + " on zimbraMailHost: " + zmMailHost);
		CacheEntrySelector zmCacheEntrySelector = new CacheEntrySelector();
		zmCacheEntrySelector.setBy(CacheEntryBy.NAME);
		zmCacheEntrySelector.setValue(name);
		CacheSelector zmCacheSelector = new CacheSelector();
		zmCacheSelector.setType("account");
		//zmCacheSelector.setAllServers(true);
		zmCacheSelector.getEntry().add(zmCacheEntrySelector);
		FlushCacheRequest zmFlushCacheRequest = new FlushCacheRequest();
		zmFlushCacheRequest.setCache(zmCacheSelector);
		changeZimbraWsProxy(zmMailHost);
		zimbraAdminPort.flushCacheRequest(zmFlushCacheRequest);

		logger.debug("Done flushing password cache for: " + name);
		
		return "response";
	}
	
	private void changeZimbraWsProxy(String endpointHost) {
		String endpointAddress = "https://" + endpointHost + ":7071/service/admin/soap/";
		BindingProvider bp = (BindingProvider) zimbraAdminPort;
		logger.debug("Endpoint address: " + bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
		logger.debug("Setting new endpoint address to: " + endpointAddress);
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress);
		logger.debug("Endpoint address: " + bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
	}
}
