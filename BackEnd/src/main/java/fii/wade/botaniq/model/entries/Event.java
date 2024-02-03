package fii.wade.botaniq.model.entries;

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
@DynamoDBTable(tableName = "Events")
public class Event extends BaseEntry {

  @DynamoDBAttribute private String date;
  @DynamoDBAttribute private String description;
  @DynamoDBAttribute private int people;
  @DynamoDBAttribute private String socialMediaLinks;
}
