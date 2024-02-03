package fii.wade.botaniq.repository.impl;

import fii.wade.botaniq.model.impl.Plant;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
@SuperBuilder
public class PlantRepository extends BaseRepository<Plant> {}
