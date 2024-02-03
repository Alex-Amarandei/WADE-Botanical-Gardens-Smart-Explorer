package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.BaseEntry;
import fii.wade.botaniq.repository.BaseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseController<E extends BaseEntry, R extends BaseRepository<E>> {

  protected R repository;
  protected Class<E> eClass;

  @PostMapping
  public ResponseEntity<E> create(@RequestBody E e) {

    return new ResponseEntity<>(repository.save(e), HttpStatus.CREATED);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<E> read(@PathVariable("id") String id) {

    return repository
        .findById(id, eClass)
        .map(e -> new ResponseEntity<>(e, HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.OK));
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<E> update(@PathVariable("id") String id, @RequestBody E e) {

    return new ResponseEntity<>(repository.save(e), HttpStatus.OK);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<E> delete(@PathVariable("id") String id) {

    return repository
        .findById(id, eClass)
        .map(
            e -> {
              repository.delete(e);
              return new ResponseEntity<>(e, HttpStatus.OK);
            })
        .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.OK));
  }
}
