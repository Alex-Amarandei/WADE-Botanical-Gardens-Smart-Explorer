package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.impl.Plant;
import fii.wade.botaniq.repository.impl.PlantRepository;
import fii.wade.botaniq.service.BaseService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PlantService implements BaseService<Plant> {

  private PlantRepository plantRepository;

  @Override
  public Plant create(Plant plant) {

    return plantRepository.save(plant);
  }

  @Override
  public Optional<Plant> read(String id) {

    return plantRepository.findById(id, Plant.class);
  }

  @Override
  public Optional<Plant> update(String id, Plant plant) {

    return plantRepository.updateById(id, plant, Plant.class);
  }

  @Override
  public void delete(String id) {

    plantRepository.findById(id, Plant.class).ifPresent(plant -> plantRepository.delete(plant));
  }
}
