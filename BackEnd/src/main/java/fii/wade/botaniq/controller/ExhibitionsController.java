package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.entries.Exhibition;
import fii.wade.botaniq.model.misc.Location;
import fii.wade.botaniq.repository.repos.ExhibitionRepository;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/exhibitions")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExhibitionsController {

  private ExhibitionRepository exhibitionRepository;

  @GetMapping
  public ResponseEntity<List<Exhibition>> getAllExhibitions() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{exhibitionId}")
  public ResponseEntity<Exhibition> getExhibition(@PathVariable("exhibitionId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Exhibition> addExhibition(@RequestBody Exhibition exhibition) {
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @PutMapping(path = "/{exhibitionId}")
  public ResponseEntity<Exhibition> updateExhibition(
      @PathVariable("exhibitionId") String id, @RequestBody Exhibition exhibition) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{exhibitionId}")
  public ResponseEntity<Exhibition> deleteExhibition(@PathVariable("exhibitionId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/location")
  public ResponseEntity<Exhibition> getExhibitionsByLocation(@RequestBody Location location) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/dateRange")
  public ResponseEntity<Exhibition> getExhibitionsByDate(
      @RequestBody String startDate, @RequestBody String endDate) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{exhibitionId}/plants")
  public ResponseEntity<Exhibition> getPlantsByExhibition(@PathVariable("exhibitionId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
