package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Event;
import fii.wade.botaniq.model.impl.Review;
import fii.wade.botaniq.repository.impl.EventRepository;
import fii.wade.botaniq.repository.impl.ReviewRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/reviews")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ReviewsController extends BaseController<Review, ReviewRepository> {

  @GetMapping(path = "/{username}")
  public ResponseEntity<Review> getReviewByUsername(@PathVariable("username") String username) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
