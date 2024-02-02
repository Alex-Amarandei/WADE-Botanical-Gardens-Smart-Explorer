package fii.wade.botaniq.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import fii.wade.botaniq.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private DynamoDBMapper mapper;

    public User addUser(User user){
        mapper.save(user);
        return user;
    }
}
