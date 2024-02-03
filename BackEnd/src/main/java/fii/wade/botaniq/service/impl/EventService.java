package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.impl.Event;
import fii.wade.botaniq.repository.impl.EventRepository;
import fii.wade.botaniq.service.BaseService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EventService implements BaseService<Event> {

  private EventRepository eventRepository;

  @Override
  public Event create(Event event) {

    return eventRepository.save(event);
  }

  @Override
  public Optional<Event> read(String id) {

    return eventRepository.findById(id, Event.class);
  }

  @Override
  public Optional<Event> update(String id, Event event) {

    return eventRepository.updateById(id, event, Event.class);
  }

  @Override
  public void delete(String id) {

    eventRepository.findById(id, Event.class).ifPresent(event -> eventRepository.delete(event));
  }
}
