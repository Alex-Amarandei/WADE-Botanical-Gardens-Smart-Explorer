package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.entries.Plant;
import fii.wade.botaniq.repository.repos.PlantRepository;
import java.util.List;
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
public class PlantsController {

  private PlantRepository plantRepository;

  @GetMapping
  public ResponseEntity<List<Plant>> getAllPlants() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{plantId}")
  public ResponseEntity<Plant> getPlant(@PathVariable("plantId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Plant> addPlant(@RequestBody Plant plant) {
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @PutMapping(path = "/{plantId}")
  public ResponseEntity<Plant> updatePlant(
      @PathVariable("plantId") String id, @RequestBody Plant plant) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{plantId}")
  public ResponseEntity<Plant> deletePlant(@PathVariable("plantId") String id) {
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
