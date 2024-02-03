package fii.wade.botaniq.repository.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.impl.Plant;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

@Repository
public class PlantRepository extends BaseRepository<Plant> {
  public PlantRepository(DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }
}
