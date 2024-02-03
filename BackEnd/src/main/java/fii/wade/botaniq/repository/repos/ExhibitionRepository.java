package fii.wade.botaniq.repository.repos;

import fii.wade.botaniq.model.entries.Exhibition;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
@SuperBuilder
public class ExhibitionRepository extends BaseRepository<Exhibition> {}
