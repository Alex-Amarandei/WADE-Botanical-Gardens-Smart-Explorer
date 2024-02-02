package fii.wade.botaniq.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@DynamoDBDocument
@DynamoDBTable(tableName = "BotaniqScape")
public class User {

    @DynamoDBHashKey(attributeName = "entryType")
    private String entryType ;
    @DynamoDBHashKey(attributeName = "id")
    private String id ;
    @DynamoDBAttribute
    private String firstName;
    @DynamoDBAttribute
    private String lastName;
    @DynamoDBAttribute
    private String birthday;
    @DynamoDBAttribute
    private String username;
    @DynamoDBAttribute
    private String password;
    @DynamoDBAttribute
    private String email;
    @DynamoDBAttribute
    private String phone;
    @DynamoDBAttribute
    private String role;
    //private List<Photos> photos;
}
