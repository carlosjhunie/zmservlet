package net.telus.zmclient.handler;


import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class ZmHeaderHandler implements SOAPHandler<SOAPMessageContext> {
	
	private String authToken;

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			try {
				SOAPMessage message = context.getMessage();
				if (context.containsKey("authToken")) {
					authToken = (String) context.get("authToken");
				
					System.out.println("Got authToken");
					SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
					SOAPHeader header = envelope.getHeader();
					if (header == null) {
						header = envelope.addHeader();
					}
					System.out.println("Constructing header...");
					QName headerContextName = new QName("urn:zimbra", "context","urn");
					SOAPHeaderElement headerContext = header.addHeaderElement(headerContextName);
					System.out.println("<urn:context/>");
					QName authTokenName = new QName("urn:zimbra", "authToken","urn");
					SOAPElement authTokenElement = headerContext.addChildElement(authTokenName);
					System.out.println("<urn:context><urn:authToken/></urn:context>");
					authTokenElement.addTextNode(authToken);
					System.out.println("<urn:context><urn:authToken>?</urn:authToken></urn:context>");
					message.saveChanges();
				}
				//Print out the outbound SOAP message to System.out
				message.writeTo(System.out);
				System.out.println("<eom>");
			} catch (SOAPException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				//This handler does nothing with the response from the Web Service so
				//we just print out the SOAP message.
				SOAPMessage message = context.getMessage();
				message.writeTo(System.out);
				System.out.println("<eom>");
			} catch (SOAPException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		return outboundProperty;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		SOAPMessage message = context.getMessage();
		try {
			message.writeTo(System.out);
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("<eom>");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// NoOp
	}

	@Override
	public Set<QName> getHeaders() {
		return Collections.emptySet();
	}

}
