package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.BaseEntry;
import fii.wade.botaniq.service.BaseService;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Getter
public class BaseController<E extends BaseEntry, S extends BaseService<E>> {

  protected S service;

  @PostMapping
  public ResponseEntity<E> create(@RequestBody E e) {

    return new ResponseEntity<>(service.create(e), HttpStatus.CREATED);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<E> read(@PathVariable("id") String id) {

    return new ResponseEntity<>(service.read(id).orElse(null), HttpStatus.OK);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<E> update(@PathVariable("id") String id, @RequestBody E e) {

    return new ResponseEntity<>(service.update(id, e).orElse(null), HttpStatus.OK);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<String> delete(@PathVariable("id") String id) {

    service.delete(id);
    return new ResponseEntity<>("", HttpStatus.OK);
  }
}
