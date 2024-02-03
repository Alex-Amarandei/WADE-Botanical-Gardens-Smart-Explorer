package fii.wade.botaniq.repository.repos;

import fii.wade.botaniq.model.entries.Review;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
@SuperBuilder
public class ReviewRepository extends BaseRepository<Review> {}
