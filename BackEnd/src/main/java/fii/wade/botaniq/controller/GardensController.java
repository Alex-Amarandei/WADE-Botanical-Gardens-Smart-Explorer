package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.entries.Garden;
import fii.wade.botaniq.model.misc.Location;
import fii.wade.botaniq.repository.repos.GardenRepository;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/gardens")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GardensController {

  private GardenRepository gardenRepository;

  @GetMapping
  public ResponseEntity<List<Garden>> getAllGardens() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{gardenId}")
  public ResponseEntity<Garden> getGarden(@PathVariable("gardenId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Garden> addGarden(@RequestBody Garden garden) {
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @PutMapping(path = "/{gardenId}")
  public ResponseEntity<Garden> updateGarden(
      @PathVariable("gardenId") String id, @RequestBody Garden garden) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{gardenId}")
  public ResponseEntity<Garden> deleteGarden(@PathVariable("gardenId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/location")
  public ResponseEntity<Garden> getGardensByLocation(@RequestBody Location location) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{gardenId}/plants")
  public ResponseEntity<List<Garden>> getPlantsByGarden(@PathVariable("gardenId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{gardenId}/events")
  public ResponseEntity<List<Garden>> getEventsByGarden(@PathVariable("gardenId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{gardenId}/exhibition")
  public ResponseEntity<List<Garden>> getExhibitionsByGarden(@PathVariable("gardenId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
