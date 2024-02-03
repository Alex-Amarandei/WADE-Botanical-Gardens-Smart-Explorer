package fii.wade.botaniq.repository.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.impl.Event;
import fii.wade.botaniq.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepository extends BaseRepository<Event> {
  public EventRepository(DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }
}
