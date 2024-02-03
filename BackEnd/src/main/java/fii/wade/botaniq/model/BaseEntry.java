package fii.wade.botaniq.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
public class BaseEntry {
  @DynamoDBHashKey(attributeName = "id")
  private String partitionKey;
}
