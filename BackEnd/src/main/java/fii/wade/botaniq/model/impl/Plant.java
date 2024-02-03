package fii.wade.botaniq.model.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import fii.wade.botaniq.model.BaseEntry;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@DynamoDBDocument
@DynamoDBTable(tableName = "Plants")
public class Plant extends BaseEntry {

  @DynamoDBAttribute private String description;
  @DynamoDBAttribute private String plantHabit;
  @DynamoDBAttribute private String lifeCycle;
  @DynamoDBAttribute private String soilPreferences;
  @DynamoDBAttribute private String gardenOrgUrl;
}
