package fii.wade.botaniq.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Value("${amazon.dynamodb.endpoint}")
    private String serviceEndpoint;

    @Value("${amazon.aws.accesskey}")
    private String accessKey;

    @Value("${amazon.aws.secretkey}")
    private String secretKey;

    @Value("${amazon.aws.region}")
    private String signInRegion;

    @Bean
    public DynamoDBMapper mapper(){
        return new DynamoDBMapper(dynamoDBMapper());
    }

    private AmazonDynamoDB dynamoDBMapper(){
        return AmazonDynamoDBAsyncClientBuilder.standard().withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(serviceEndpoint, signInRegion))
                .withCredentials((new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey,secretKey))))
                .build();
    }
}
