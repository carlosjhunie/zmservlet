package net.telus.zmclient.web;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.xml.internal.ws.api.message.Header;
import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;

import net.telus.zimbra.ws.client.ZcsAdminPortType;
import zimbra.AccountBy;
import zimbra.AccountSelector;
import zimbra.AuthTokenControl;
import zimbra.HeaderContext;
import zimbra.ObjectFactory;
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
	private ZcsAdminPortType zimbraJaxProxyService;
	
	private String adminName = "pwm-notification@telus.net";
	private String adminPassword = "pwmsmtp";

	@RequestMapping(method = RequestMethod.GET)
	public String doAction(@RequestParam(value = "name") String name,  Model model) 
	{
		logger.debug("Received request to flush zimbra password cache");

		AuthRequest zmAuthRequest = new AuthRequest();
		zmAuthRequest.setPersistAuthTokenCookie(true);
		zmAuthRequest.setName(adminName);
		zmAuthRequest.setPassword(adminPassword);
		AuthResponse zmAuthResponse = zimbraJaxProxyService.authRequest(zmAuthRequest);
		String authToken = zmAuthResponse.getAuthToken();
		// TODO how to set Auth token?
		try {
			addSoapAuthHeader((WSBindingProvider) zimbraJaxProxyService, authToken);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
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
	
	private void addSoapAuthHeader(WSBindingProvider bp, String authToken)
			throws JAXBException, ParserConfigurationException 
	{
		AuthTokenControl tokenControl = new AuthTokenControl();
		tokenControl.setVoidOnExpired(true);
		HeaderContext headerContext = new HeaderContext();
		headerContext.setAuthToken(authToken);
		headerContext.setAuthTokenControl(tokenControl);
		
		Header soapHdr = Headers.create(makeZimbraSoapHeaderContext(headerContext));
		bp.setOutboundHeaders(soapHdr);
	}

	private Element makeZimbraSoapHeaderContext(HeaderContext contextJaxb)
	        throws JAXBException, ParserConfigurationException
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document doc = dbf.newDocumentBuilder().newDocument();
        JAXBContext jaxb = JAXBContext.newInstance(HeaderContext.class);
        Marshaller marshaller = jaxb.createMarshaller();
        ObjectFactory fact = new ObjectFactory();
        JAXBElement zimbraSoapHdrCtxt = fact.createContext(contextJaxb);
        marshaller.marshal(zimbraSoapHdrCtxt, doc);
        return doc.getDocumentElement();
	}
}
