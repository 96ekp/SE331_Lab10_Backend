package se331.lab.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;



public interface EventService {
    public Integer getEventSize();
    public Page<Event> getEvents(Integer pageSize, Integer page);
    public Event getEvent(Long id);
    Event save(Event event);
    Page<Event> getEvents(String title, Pageable pageable);


}
