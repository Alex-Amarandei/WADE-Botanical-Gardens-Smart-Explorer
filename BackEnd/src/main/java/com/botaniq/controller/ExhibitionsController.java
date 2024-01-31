package com.botaniq.controller;

import com.botaniq.model.Exhibition;
import com.botaniq.model.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/exhibitions")
public class ExhibitionsController {
    @GetMapping
    public ResponseEntity<List<Exhibition>> getAllExhibitions(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{exhibitionId}")
    public ResponseEntity<Exhibition> getExhibition(@PathVariable("exhibitionId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Exhibition> addExhibition(@RequestBody Exhibition exhibition){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{exhibitionId}")
    public ResponseEntity<Exhibition> updateExhibition(@PathVariable("exhibitionId") String id, @RequestBody Exhibition exhibition){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{exhibitionId}")
    public ResponseEntity<Exhibition> deleteExhibition(@PathVariable("exhibitionId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/location")
    public ResponseEntity<Exhibition> getExhibitionsByLocation(@RequestBody Location location){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/dateRange")
    public ResponseEntity<Exhibition> getExhibitionsByDate(@RequestBody String startDate, @RequestBody String endDate){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{exhibitionId}/plants")
    public ResponseEntity<Exhibition> getPlantsByExhibition(@PathVariable("exhibitionId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
