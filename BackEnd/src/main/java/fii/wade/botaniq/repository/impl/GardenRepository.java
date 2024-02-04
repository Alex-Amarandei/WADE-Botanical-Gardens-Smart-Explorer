package fii.wade.botaniq.repository.impl;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import fii.wade.botaniq.model.impl.Exhibition;
import fii.wade.botaniq.model.impl.Garden;
import fii.wade.botaniq.repository.BaseRepository;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class GardenRepository extends BaseRepository<Garden> {
  public GardenRepository(DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }
}
