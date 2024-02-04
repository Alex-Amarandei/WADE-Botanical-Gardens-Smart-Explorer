package fii.wade.botaniq.sparql.controller;

import fii.wade.botaniq.sparql.service.SparqlService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Getter
@RestController
@RequestMapping(path = "/sparql")
public class SparqlController {

    @Autowired
    private SparqlService sparqlService;

    @GetMapping("/{endpoint}/{term}")
    public ResponseEntity<String> getUrlValue(@PathVariable("endpoint") String endpoint, @PathVariable("term") String term) throws IOException {
        return new ResponseEntity<>(sparqlService.sendGetRequest(endpoint, term), HttpStatus.OK);
    }
}