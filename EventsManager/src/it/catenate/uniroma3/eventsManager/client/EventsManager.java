package it.catenate.uniroma3.eventsManager.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.EventBus;

public class EventsManager implements EntryPoint {

	public void onModuleLoad() {
		EventBus eventBus = new SimpleEventBus();
		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		EventManagerApp appViewer = new EventManagerApp(new MainPanel(), eventBus);
		appViewer.go(rootPanel);
	}

}
