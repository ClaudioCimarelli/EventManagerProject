package it.catenate.uniroma3.eventsManager.server.persistence;

import it.catenate.uniroma3.eventsManager.server.Event;

import java.util.List;

public class EventService
{

    public Integer count() { return CEM.list().size(); }

    public Event find(Long id) { return CEM.fetch(id); }

    public List<Event> findAllEvents() { return CEM.list(); };

    public void persist(Event c) { CEM.persist(c); }

    public void remove(Event c) { CEM.delete(c.getId()); }

}
