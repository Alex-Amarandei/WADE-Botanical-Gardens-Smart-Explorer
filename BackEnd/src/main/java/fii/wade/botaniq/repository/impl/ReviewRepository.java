package fii.wade.botaniq.repository.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.impl.Review;
import fii.wade.botaniq.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository extends BaseRepository<Review> {
    public ReviewRepository(DynamoDBMapper dynamoDBMapper) {
        super(dynamoDBMapper);
    }
}
