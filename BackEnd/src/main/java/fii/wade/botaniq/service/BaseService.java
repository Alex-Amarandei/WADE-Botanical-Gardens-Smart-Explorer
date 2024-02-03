package fii.wade.botaniq.service;

import fii.wade.botaniq.model.BaseEntry;
import fii.wade.botaniq.repository.BaseRepository;
import org.springframework.http.ResponseEntity;

public interface  BaseService <E extends BaseEntry> {
     E create(E e);
     E read(String id);
     E update(String id,  E e);
     void delete(String id);
}