package fii.wade.botaniq.repository.repos;

import fii.wade.botaniq.model.entries.Plant;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
@SuperBuilder
public class PlantRepository extends BaseRepository<Plant> {}
