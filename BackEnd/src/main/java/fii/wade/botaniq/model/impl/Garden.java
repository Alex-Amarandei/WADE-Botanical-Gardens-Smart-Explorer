package fii.wade.botaniq.model.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import fii.wade.botaniq.model.BaseEntry;
import fii.wade.botaniq.model.misc.Location;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@DynamoDBDocument
@DynamoDBTable(tableName = "Gardens")
public class Garden extends BaseEntry {

  @DynamoDBAttribute private String description;
  @DynamoDBAttribute private Location location;
  @DynamoDBAttribute private List<Event> eventList;
  @DynamoDBAttribute private List<Exhibition> exhibitionList;
  @DynamoDBAttribute private List<String> resources;
}
