package it.catenate.uniroma3.eventsManager.server.persistence;

import it.catenate.uniroma3.eventsManager.server.Event;

import java.util.Date;

import com.google.web.bindery.requestfactory.shared.Locator;

/**
 * The Class ContactLocator.
 */
public class EventLocator extends Locator<Event, Long>
{

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.Locator#create(java.lang.Class)
     */
    @Override
    public Event create (Class<? extends Event> clazz)
    {
        return new Event();
    }

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.Locator#find(java.lang.Class, java.lang.Object)
     */
    @Override
    public Event find (Class<? extends Event> clazz, Long id)
    {
        return CEM.fetch(id);
    }

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.Locator#getDomainType()
     */
    @Override
    public Class<Event> getDomainType ()
    {
        return Event.class;
    }

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.Locator#getId(java.lang.Object)
     */
    @Override
    public Long getId (Event event)
    {
        return event.getId();
    }

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.Locator#getIdType()
     */
    @Override
    public Class<Long> getIdType ()
    {
        return Long.class;
    }

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.Locator#getVersion(java.lang.Object)
     */
    @Override
    public Object getVersion (Event event)
    {
        return event.getVersion();
    }

}
