package fii.wade.botaniq.service;

import fii.wade.botaniq.model.entry.BaseEntry;
import java.util.List;
import java.util.Optional;

public interface BaseService<E extends BaseEntry> {

  E create(E e);

  Optional<E> read(String id);

  Optional<E> update(String id, E e);

  void delete(String id);

  List<E> getAll();
}
