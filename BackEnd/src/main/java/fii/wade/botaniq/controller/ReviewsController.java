package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.entries.Review;
import fii.wade.botaniq.repository.repos.ReviewRepository;
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
public class ReviewsController {

  private ReviewRepository reviewRepository;

  @PostMapping
  public ResponseEntity<Review> addReview(@RequestBody Review review) {
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @GetMapping(path = "/{itemId}")
  public ResponseEntity<Review> getReviewById(@PathVariable("itemId") String id) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/{username}")
  public ResponseEntity<Review> getReviewByUsername(@PathVariable("username") String username) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
