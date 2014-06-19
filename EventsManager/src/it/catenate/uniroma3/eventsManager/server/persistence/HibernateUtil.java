package it.catenate.uniroma3.eventsManager.server.persistence;

import it.catenate.uniroma3.eventsManager.server.Event;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Startup Hibernate and provide access to the singleton SessionFactory
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		try {
			Configuration cfg = new Configuration().configure();
			/*cfg.addAnnotatedClass(Event.class);
			sessionFactory = cfg
					.buildSessionFactory(new ServiceRegistryBuilder()
							.applySettings(cfg.getProperties()).build());*/
			sessionFactory = cfg.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		// Alternatively, we could look up in JNDI here
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}
