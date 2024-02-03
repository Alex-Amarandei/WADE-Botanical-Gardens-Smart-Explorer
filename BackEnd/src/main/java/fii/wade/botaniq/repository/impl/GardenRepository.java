package fii.wade.botaniq.repository.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.impl.Garden;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
public class GardenRepository extends BaseRepository<Garden> {
  public GardenRepository(DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }
}
