package it.catenate.uniroma3.eventsManager.client.view;

import it.catenate.uniroma3.eventsManager.client.request.proxy.EventProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.editor.client.ValueAwareEditor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class EventEditor extends Composite implements ValueAwareEditor<EventProxy> {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, EventEditor> {
	}

	public EventEditor() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setDelegate(EditorDelegate<EventProxy> delegate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPropertyChange(String... paths) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(EventProxy value) {
		// TODO Auto-generated method stub
		
	}

}
