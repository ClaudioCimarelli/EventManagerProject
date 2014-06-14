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

import it.catenate.uniroma3.eventsManager.client.view.EventCreationPlace;
import it.catenate.uniroma3.eventsManager.client.view.EventCreationView;
import it.catenate.uniroma3.eventsManager.client.view.EventCreationViewImpl;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

/**
 * Activities are started and stopped by an ActivityManager associated with a container Widget.
 */
public class EventCreationActivity extends AbstractActivity implements EventCreationView.Presenter {

	
	public EventCreationActivity(EventCreationPlace place) {
	}

	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		EventCreationViewImpl view = new EventCreationViewImpl();
		//view.setPresenter(this);
		containerWidget.setWidget(view.asWidget());
	}

	@Override
	public String mayStop() {
		return "Please hold on. This activity is stopping.";
	}

	/**
	 * @see EventCreationView.Presenter#goTo(Place)
	 */
	public void goTo(Place place) {
		// TODO
	}
}
