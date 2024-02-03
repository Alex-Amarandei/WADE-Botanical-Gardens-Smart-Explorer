package fii.wade.botaniq.model.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import fii.wade.botaniq.model.BaseEntry;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@DynamoDBDocument
@DynamoDBTable(tableName = "Users")
public class User extends BaseEntry {

  @DynamoDBAttribute private String firstName;
  @DynamoDBAttribute private String lastName;
  @DynamoDBAttribute private String birthday;
  @DynamoDBAttribute private String password;
  @DynamoDBAttribute private String email;
  @DynamoDBAttribute private String phone;
}
