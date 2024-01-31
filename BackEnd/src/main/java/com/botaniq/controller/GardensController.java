package com.botaniq.controller;

import com.botaniq.model.Garden;
import com.botaniq.model.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/gardens")
public class GardensController {
    @GetMapping
    public ResponseEntity<List<Garden>> getAllGardens(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{gardenId}")
    public ResponseEntity<Garden> getGarden(@PathVariable("gardenId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Garden> addGarden(@RequestBody Garden garden){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{gardenId}")
    public ResponseEntity<Garden> updateGarden(@PathVariable("gardenId") String id, @RequestBody Garden garden){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{gardenId}")
    public ResponseEntity<Garden> deleteGarden(@PathVariable("gardenId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/location")
    public ResponseEntity<Garden> getGardensByLocation(@RequestBody Location location){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{gardenId}/plants")
    public ResponseEntity<List<Garden>> getPlantsByGarden(@PathVariable("gardenId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{gardenId}/events")
    public ResponseEntity<List<Garden>> getEventsByGarden(@PathVariable("gardenId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{gardenId}/exhibition")
    public ResponseEntity<List<Garden>> getExhibitionsByGarden(@PathVariable("gardenId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
