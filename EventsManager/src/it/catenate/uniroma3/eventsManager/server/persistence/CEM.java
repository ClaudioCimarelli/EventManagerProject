package it.catenate.uniroma3.eventsManager.server.persistence;

import it.catenate.uniroma3.eventsManager.server.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


public class CEM
{
  static ConcurrentHashMap<Long, Event> entities = new ConcurrentHashMap<Long, Event>();
  static AtomicLong index = new AtomicLong();



  public static void persist (Event entity) {
    if (entity.getId() == null) entity.setId(index.incrementAndGet());
    if (entity.getVersion() == null)
      entity.setVersion(1);
    else
      entity.setVersion(entity.getVersion() + 1);
    entities.put(entity.getId(), entity);
  }

  public static Event fetch (Long id) {
    Event contact = entities.get(id);
    if (contact == null) return null;
    return copy(entities.get(id));
  }

  public static boolean delete (Long id) {
    return entities.remove(id) != null;
  }

  public static List<Event> list () {
    ArrayList<Event> result = new ArrayList<Event>();
    for (Event e : entities.values())
      result.add(copy(e));
    return result;
  }

  private static Event copy (Event c) {
    Event copy = new Event();
    copy.setId(c.getId());
    copy.setVersion(c.getVersion());
    copy.setDate(c.getDate());
    copy.setOrganizzazione(c.getOrganizzazione());
    copy.setNotes(c.getNotes());
    return copy;
  }
}
