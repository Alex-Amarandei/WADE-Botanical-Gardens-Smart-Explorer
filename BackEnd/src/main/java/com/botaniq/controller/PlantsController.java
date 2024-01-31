package com.botaniq.controller;

import com.botaniq.model.Plant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/plants")
public class PlantsController {
    @GetMapping
    public ResponseEntity<List<Plant>> getAllPlants(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{plantId}")
    public ResponseEntity<Plant> getPlant(@PathVariable("plantId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Plant> addPlant(@RequestBody Plant plant){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{plantId}")
    public ResponseEntity<Plant> updatePlant(@PathVariable("plantId") String id, @RequestBody Plant plant){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{plantId}")
    public ResponseEntity<Plant> deletePlant(@PathVariable("plantId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/season")
    public ResponseEntity<Plant> getPlantsBySeason(@RequestBody String season){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


    @GetMapping(path = "/{plantId}/events")
    public ResponseEntity<Plant> getEventsByPlant(@PathVariable("plantId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{plantId}/exhibitions")
    public ResponseEntity<Plant> getExhibitionsByPlant(@PathVariable("plantId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
