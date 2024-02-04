package fii.wade.botaniq.model.entry.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import fii.wade.botaniq.model.entry.BaseEntry;
import fii.wade.botaniq.model.Event;
import fii.wade.botaniq.model.Exhibition;
import fii.wade.botaniq.model.Location;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@DynamoDBDocument
@DynamoDBTable(tableName = "garden")
public class Garden extends BaseEntry {

  @DynamoDBAttribute private String description;
  @DynamoDBAttribute private String price;
  @DynamoDBAttribute private Double rating;
  @DynamoDBAttribute private String photoUrl;
  @DynamoDBAttribute private Location location;
  @DynamoDBAttribute private List<Event> eventList;
  @DynamoDBAttribute private List<Exhibition> exhibitionList;
}
