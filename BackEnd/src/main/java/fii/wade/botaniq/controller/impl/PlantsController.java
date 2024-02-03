package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Event;
import fii.wade.botaniq.model.impl.Plant;
import java.util.List;

import fii.wade.botaniq.repository.impl.EventRepository;
import fii.wade.botaniq.repository.impl.PlantRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/plants")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PlantsController extends BaseController<Plant, PlantRepository> {

  @GetMapping
  public ResponseEntity<List<Plant>> getAllPlants() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/season")
  public ResponseEntity<Plant> getPlantsBySeason(@RequestBody String season) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{plantId}/events")
  public ResponseEntity<Plant> getEventsByPlant(@PathVariable("plantId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{plantId}/exhibitions")
  public ResponseEntity<Plant> getExhibitionsByPlant(@PathVariable("plantId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
