package it.catenate.uniroma3.eventsManager.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class SituazioneCassa extends Composite {

	private static final Binder binder = GWT.create(Binder.class);
	

	interface Binder extends UiBinder<Widget, SituazioneCassa> {
	}

	public SituazioneCassa() {
		initWidget(binder.createAndBindUi(this));
	}

}
