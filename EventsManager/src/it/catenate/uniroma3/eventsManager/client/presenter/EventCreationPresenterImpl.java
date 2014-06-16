package it.catenate.uniroma3.eventsManager.client.presenter;

import it.catenate.uniroma3.eventsManager.client.request.Factory;
import it.catenate.uniroma3.eventsManager.client.request.Factory.EventRequest;
import it.catenate.uniroma3.eventsManager.client.request.proxy.EventProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;

public class EventCreationPresenterImpl implements EventCreationPresenter {
	
	public interface Display {
	    void setPresenter(EventCreationPresenter p);
	    Widget asWidget();
	}
	
	
	private Display display;
	private EventBus eventbus;
	private Factory requestFactory;
	private EventRequest requestContext;
	private EventProxy eventProxy;
	
	
	public EventCreationPresenterImpl(Display display, EventBus eventbus) {
		super();
		this.display = display;
		this.eventbus = eventbus;
		/*this.requestFactory = GWT.create(Factory.class);		
		requestFactory.initialize(this.eventbus);
		this.eventProxy = this.requestContext.create(EventProxy.class);
		/*
		final EventBus eventBus = new SimpleEventBus();
		this.requestContext = requestFactory.createEventRequest();
		
		driver.initialize(requestFactory,this.display.getEventEditor());
		driver.edit(this.eventProxy, requestContext);*/
	}

	private void bind() {
		this.display.setPresenter(this);
	}

	@Override
	public void go(HasWidgets container) {
		bind();
	    container.clear();
		container.add(display.asWidget());
	}

	@Override
	public void onSaveEvent() {
		// TODO Auto-generated method stub

	}

}
