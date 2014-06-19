package it.catenate.uniroma3.eventsManager.client.request;

import it.catenate.uniroma3.eventsManager.client.request.proxy.EventProxy;
import it.catenate.uniroma3.eventsManager.server.persistence.EventService;
import it.catenate.uniroma3.eventsManager.server.persistence.EventServiceLocator;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import com.google.web.bindery.requestfactory.shared.Service;

public interface Factory extends RequestFactory {
	EventRequest createEventRequest();

    @Service(value = EventService.class, locator = EventServiceLocator.class)
    public interface EventRequest extends RequestContext
    {
        Request<Integer> count();
        Request<EventProxy> find(Long id);
        Request<List<EventProxy>> findAllEvents();
        Request<EventProxy> persist(EventProxy contact);
        Request<Void> remove(EventProxy contact);
    }

	

}
