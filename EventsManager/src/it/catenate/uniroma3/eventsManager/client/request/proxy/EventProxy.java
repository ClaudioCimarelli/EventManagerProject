package it.catenate.uniroma3.eventsManager.client.request.proxy;

import java.util.Date;

import it.catenate.uniroma3.eventsManager.server.Event;
import it.catenate.uniroma3.eventsManager.server.persistence.EventLocator;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(value=Event.class, locator= EventLocator.class)
public interface EventProxy extends EntityProxy {


	Long getId();

	void setId(Long id);
	
	String getName();
	
	void setName(String name);

	Date getDate();

	void setDate(Date date);

	String getNotes();

	void setNotes(String notes);

	Integer getVersion();

	void setVersion(Integer version);

}