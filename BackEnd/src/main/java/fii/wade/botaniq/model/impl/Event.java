package fii.wade.botaniq.model.impl;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBDocument
public class Event {

    @DynamoDBAttribute
    private String name;
    @DynamoDBAttribute
    private String date;
    @DynamoDBAttribute
    private String description;
    @DynamoDBAttribute
    private String photoUrl;
    @DynamoDBAttribute
    private String socialMediaLink;
}
