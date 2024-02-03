package fii.wade.botaniq.model.misc;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
public class Location {

  @DynamoDBAttribute private String city;
  @DynamoDBAttribute private String county;
  @DynamoDBAttribute private String country;
  @DynamoDBAttribute private String streetName;
  @DynamoDBAttribute private String postalCode;
  @DynamoDBAttribute private String googleMapsLink;
}
