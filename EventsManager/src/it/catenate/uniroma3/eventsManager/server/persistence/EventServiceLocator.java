package it.catenate.uniroma3.eventsManager.server.persistence;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;

/**
 * The Class ContactServiceLocator.
 */
public class EventServiceLocator implements ServiceLocator
{
    
    /** The service instance. */
    private static EventService serviceInstance;

    /* (non-Javadoc)
     * @see com.google.web.bindery.requestfactory.shared.ServiceLocator#getInstance(java.lang.Class)
     */
    @Override
    public Object getInstance (Class<?> clazz)
    {
        return EventServiceLocator.getServiceInstance();
    }

    /**
     * Gets the service instance.
     *
     * @return the service instance
     */
    private static EventService getServiceInstance ()
    {
        if (serviceInstance == null)
            serviceInstance = new EventService();
        return serviceInstance;
    }
}
