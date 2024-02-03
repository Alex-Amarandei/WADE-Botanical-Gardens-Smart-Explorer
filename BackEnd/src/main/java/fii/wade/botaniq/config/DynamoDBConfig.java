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
  private static String serviceEndpoint;

  @Value("${amazon.aws.accesskey}")
  private static String accessKey;

  @Value("${amazon.aws.secretkey}")
  private static String secretKey;

  @Value("${amazon.aws.region}")
  private static String signInRegion;

  @Bean
  public DynamoDBMapper provideDynamoDbMapper() {

    return new DynamoDBMapper(dynamoDb());
  }

  private AmazonDynamoDB dynamoDb() {

    return AmazonDynamoDBAsyncClientBuilder.standard()
        .withEndpointConfiguration(
            new AwsClientBuilder.EndpointConfiguration(serviceEndpoint, signInRegion))
        .withCredentials(
            (new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey))))
        .build();
  }
}
