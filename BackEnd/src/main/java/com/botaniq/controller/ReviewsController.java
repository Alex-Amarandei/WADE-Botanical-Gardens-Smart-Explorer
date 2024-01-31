package com.botaniq.controller;

import com.botaniq.model.Review;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/reviews")
public class ReviewsController {
    
    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody Review review){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{itemId}")
    public ResponseEntity<Review> getReviewById(@PathVariable("itemId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    
    @GetMapping(path = "/{username}")
    public ResponseEntity<Review> getReviewByUsername(@PathVariable("username") String username){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
