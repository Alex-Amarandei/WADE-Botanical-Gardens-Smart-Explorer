package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Event;
import fii.wade.botaniq.service.impl.EventService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/events")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EventsController extends BaseController<Event, EventService> {}
