package it.catenate.uniroma3.eventsManager.client.request.proxy;

import it.catenate.uniroma3.eventsManager.server.Event;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(value=Event.class)
public interface EventProxy extends EntityProxy {

}
