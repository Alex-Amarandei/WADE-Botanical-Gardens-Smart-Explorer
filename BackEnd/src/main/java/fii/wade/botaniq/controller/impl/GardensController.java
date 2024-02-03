package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Garden;
import fii.wade.botaniq.model.misc.Location;
import fii.wade.botaniq.repository.impl.GardenRepository;
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
public class GardensController extends BaseController<Garden, GardenRepository> {

  @GetMapping
  public ResponseEntity<List<Garden>> getAllGardens() {
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
