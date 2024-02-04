package fii.wade.botaniq.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
public class Exhibition {

  @DynamoDBAttribute private String name;
  @DynamoDBAttribute private String season;
  @DynamoDBAttribute private String description;
  @DynamoDBAttribute private String photoUrl;
  @DynamoDBAttribute private List<Plant> plantList;
}
