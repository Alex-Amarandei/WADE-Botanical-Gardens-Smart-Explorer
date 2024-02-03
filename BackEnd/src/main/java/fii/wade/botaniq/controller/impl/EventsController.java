package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Event;
import fii.wade.botaniq.model.misc.Location;
import fii.wade.botaniq.repository.impl.EventRepository;
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
public class EventsController extends BaseController<Event, EventRepository> {

  @GetMapping
  public ResponseEntity<List<Event>> getAllEvents() {
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
