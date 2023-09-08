package se331.lab.rest.service;

import org.springframework.data.domain.Page;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.List;


public interface EventService {
    public Integer getEventSize();
    public Page<Event> getEvents(Integer pageSize, Integer page);
    public Event getEvent(Long id);
    Event save(Event event);


}
