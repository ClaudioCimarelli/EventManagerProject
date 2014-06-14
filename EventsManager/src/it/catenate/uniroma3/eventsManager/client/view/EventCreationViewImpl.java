/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package it.catenate.uniroma3.eventsManager.client.view;

import it.catenate.uniroma3.eventsManager.client.presenter.EventCreationPresenter;
import it.catenate.uniroma3.eventsManager.client.presenter.EventCreationPresenterImpl;
import it.catenate.uniroma3.eventsManager.client.request.Factory;
import it.catenate.uniroma3.eventsManager.client.request.Factory.EventRequest;
import it.catenate.uniroma3.eventsManager.client.request.proxy.EventProxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;


public class EventCreationViewImpl extends Composite implements EventCreationPresenterImpl.Display{

	interface Binder extends UiBinder<Widget, EventCreationViewImpl> {	}
	
	private static final Binder binder = GWT.create(Binder.class);

	private EventCreationPresenter presenter;

	private Factory requestFactory;

	private EventRequest requestContext;
	
	private EventProxy eventProxy;
	
	Driver driver = GWT.create(Driver.class);
	interface Driver extends
	RequestFactoryEditorDriver<EventProxy, EventEditor> {
}

	public EventCreationViewImpl() {
		initWidget(binder.createAndBindUi(this));
		this.requestFactory = GWT.create(Factory.class);
		final EventBus eventBus = new SimpleEventBus();
		requestFactory.initialize(eventBus);
		this.requestContext = requestFactory.createEventRequest();
		driver.initialize(requestFactory, eventEditor);
		driver.edit(this.eventProxy, requestContext);
	}

	public void setPresenter(EventCreationPresenter presenter) {
		this.presenter = presenter;
	}
	
	@UiField
	EventEditor eventEditor;
	@UiField Button saveButton;
	@UiField Button clearButton;
	
	@UiHandler("saveButton")
	void onSaveButtonClick(ClickEvent event) {
	}

	@Override
	public EventEditor getEventEditor() {
		return this.eventEditor;
	}
}
