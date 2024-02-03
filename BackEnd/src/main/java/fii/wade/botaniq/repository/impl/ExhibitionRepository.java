package fii.wade.botaniq.repository.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.impl.Exhibition;
import fii.wade.botaniq.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ExhibitionRepository extends BaseRepository<Exhibition> {
  public ExhibitionRepository(DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }
}
