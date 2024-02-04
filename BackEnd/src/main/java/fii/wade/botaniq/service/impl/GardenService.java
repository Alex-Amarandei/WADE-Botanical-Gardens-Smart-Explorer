package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.entry.impl.Garden;
import fii.wade.botaniq.repository.impl.GardenRepository;
import fii.wade.botaniq.service.BaseService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class GardenService implements BaseService<Garden> {

  private GardenRepository gardenRepository;

  @Override
  public Garden create(Garden garden) {

    return gardenRepository.save(garden);
  }

  @Override
  public Optional<Garden> read(String id) {

    return gardenRepository.findById(id, Garden.class);
  }

  @Override
  public Optional<Garden> update(String id, Garden garden) {

    return gardenRepository.update(id, garden, Garden.class);
  }

  @Override
  public void delete(String id) {

    gardenRepository
        .findById(id, Garden.class)
        .ifPresent(garden -> gardenRepository.delete(garden));
  }

  @Override
  public List<Garden> getAll() {
    return gardenRepository.getAll(Garden.class);
  }
}
