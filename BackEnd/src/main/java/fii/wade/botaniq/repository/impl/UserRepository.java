package fii.wade.botaniq.repository.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.entry.impl.User;
import fii.wade.botaniq.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepository<User> {
  public UserRepository(DynamoDBMapper dynamoDBMapper) {
    super(dynamoDBMapper);
  }
}
