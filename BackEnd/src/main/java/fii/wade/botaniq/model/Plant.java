package fii.wade.botaniq.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
public class Plant {

  @DynamoDBAttribute private String name;
  @DynamoDBAttribute private String description;
  @DynamoDBAttribute private String plantHabit;
  @DynamoDBAttribute private String lifeCycle;
  @DynamoDBAttribute private String soilPreferences;
  @DynamoDBAttribute private String gardenOrgUrl;
}
