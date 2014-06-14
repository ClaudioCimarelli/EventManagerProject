package it.catenate.uniroma3.eventsManager.client;

import it.catenate.uniroma3.eventsManager.client.presenter.MainPresenter;
import it.catenate.uniroma3.eventsManager.client.presenter.Presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;

public class MainPanel extends Composite implements EventManagerApp.Display{

	private static final Binder binder = GWT.create(Binder.class);
	@UiField SimplePanel AppArea;
	@UiField Button saveButton;

	private MainPresenter presenter;

	interface Binder extends UiBinder<Widget, MainPanel> {
	}

	public MainPanel() {
		initWidget(binder.createAndBindUi(this));
		setWidgetToMaxWidthAndHeight();
        Window.addResizeHandler(resizeHandler);
	}
	
	@Override
	public Panel getAppArea() {
		
		return AppArea;
	}
	
	private ResizeHandler resizeHandler = new ResizeHandler()
    {
        public void onResize (ResizeEvent event)
        {
            setWidgetToMaxWidthAndHeight();
        }
    };

    private void setWidgetToMaxWidthAndHeight ()
    {
        setWidth("100%");
        setHeight(Window.getClientHeight() + "px");
    }

	@Override
	public void setPresenter(MainPresenter p) {
		this.presenter=p;
	}
	@UiHandler("saveButton")
	void onSaveButtonClick(ClickEvent event) {
		this.presenter.onCreateNewEvent();
	}
}
