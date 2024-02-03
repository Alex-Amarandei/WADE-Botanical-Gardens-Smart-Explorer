package fii.wade.botaniq.repository.impl;

import fii.wade.botaniq.model.impl.Garden;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
@SuperBuilder
public class GardenRepository extends BaseRepository<Garden> {}
