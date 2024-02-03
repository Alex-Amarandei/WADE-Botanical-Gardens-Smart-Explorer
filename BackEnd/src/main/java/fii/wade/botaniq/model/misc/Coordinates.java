package fii.wade.botaniq.model.misc;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@DynamoDBDocument
@AllArgsConstructor
public class Coordinates {

  private double latitude;
  private double longitude;
}
