package it.catenate.uniroma3.eventsManager.client;

import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;

import it.catenate.uniroma3.eventsManager.client.presenter.EventCreationPresenterImpl;
import it.catenate.uniroma3.eventsManager.client.presenter.MainPresenter;
import it.catenate.uniroma3.eventsManager.client.presenter.Presenter;
import it.catenate.uniroma3.eventsManager.client.view.EventEditor;

public class EventManagerApp implements MainPresenter, ValueChangeHandler<String> {

	private Display display;
	private EventBus eventbus;
	
	public interface Display {
	    Panel getAppArea(); 
	    void setPresenter(MainPresenter p);
	    Widget asWidget();
	  }
	public EventManagerApp(Display display, EventBus eventbus) {
		super();
		this.display = display;
		this.eventbus = eventbus;
	}

	private void bind() {
		this.display.setPresenter(this);
		History.addValueChangeHandler(this);
	}

	@Override
	public void go(HasWidgets container) {
		bind();
	    container.clear();
		container.add(display.asWidget());

	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();

		/*if (token != null) {
			Presenter presenter = null;

			if (presenter != null) {
				presenter.go(display.getAppArea());
			}
		}*/
	}

	@Override
	public void onCreateNewEvent() {
		Presenter presenter = new EventCreationPresenterImpl(new EventEditor(), this.eventbus );
		presenter.go(display.getAppArea());
	}

}
