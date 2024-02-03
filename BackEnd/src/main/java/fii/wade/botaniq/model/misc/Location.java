package fii.wade.botaniq.model.misc;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
@AllArgsConstructor
public class Location {
  private String city;
  private String county;
  private String country;
  private String streetName;
  private String postalCode;
  private Coordinates coordinates;
  private String googleMapsLink;
}
