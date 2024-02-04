package fii.wade.botaniq.model.entry.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import fii.wade.botaniq.model.entry.BaseEntry;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
@DynamoDBTable(tableName = "user")
public class User extends BaseEntry {

  @DynamoDBAttribute private String firstName;
  @DynamoDBAttribute private String lastName;
  @DynamoDBAttribute private String birthday;
  @DynamoDBAttribute private String password;
  @DynamoDBAttribute private String email;
  @DynamoDBAttribute private String phone;
}
