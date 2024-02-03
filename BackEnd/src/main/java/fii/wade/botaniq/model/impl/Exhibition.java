package fii.wade.botaniq.model.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@DynamoDBDocument
public class Exhibition {

    @DynamoDBAttribute
    private String season;
    @DynamoDBAttribute
    private String description;
    @DynamoDBAttribute
    private List<Plant> plantList;
}
