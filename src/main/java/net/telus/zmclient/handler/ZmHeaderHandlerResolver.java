package net.telus.zmclient.handler;


import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

@SuppressWarnings("rawtypes")
public class ZmHeaderHandlerResolver implements HandlerResolver {

	private List<Handler> handlerList;
	 
    @Override
    public List<Handler> getHandlerChain(final PortInfo portInfo) {
        return handlerList;
    }
 
    public void setHandlerList(final List<Handler> handlerList) {
        this.handlerList = handlerList;
    }

}
