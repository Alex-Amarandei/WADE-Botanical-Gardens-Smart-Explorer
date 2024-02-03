package fii.wade.botaniq.service;

import fii.wade.botaniq.model.BaseEntry;
import java.util.Optional;

public interface BaseService<E extends BaseEntry> {

  E create(E e);

  Optional<E> read(String id);

  Optional<E> update(String id, E e);

  void delete(String id);
}
