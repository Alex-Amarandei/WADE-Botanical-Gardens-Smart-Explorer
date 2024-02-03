package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.entries.Event;
import fii.wade.botaniq.model.misc.Location;
import fii.wade.botaniq.repository.repos.EventRepository;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/events")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EventsController {

  private EventRepository eventRepository;

  @GetMapping
  public ResponseEntity<List<Event>> getAllEvents() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{eventId}")
  public ResponseEntity<Event> getEvent(@PathVariable("eventId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Event> addEvent(@RequestBody Event event) {
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @PutMapping(path = "/{eventId}")
  public ResponseEntity<Event> updateEvent(
      @PathVariable("eventId") String id, @RequestBody Event event) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{eventId}")
  public ResponseEntity<Event> deleteEvent(@PathVariable("eventId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/location")
  public ResponseEntity<Event> getEventsByLocation(@RequestBody Location location) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/dateRange")
  public ResponseEntity<Event> getEventsByDate(
      @RequestBody String startDate, @RequestBody String endDate) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
