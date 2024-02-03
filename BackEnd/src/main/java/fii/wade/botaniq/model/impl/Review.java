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
@DynamoDBDocument
@DynamoDBTable(tableName = "review")
public class Review extends BaseEntry {

  @DynamoDBAttribute private String reviewDescription;
  @DynamoDBAttribute private String authorUsername;
  @DynamoDBAttribute private String itemId;
}
