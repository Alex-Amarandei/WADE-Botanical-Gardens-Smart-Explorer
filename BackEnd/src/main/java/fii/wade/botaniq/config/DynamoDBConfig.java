package fii.wade.botaniq.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

  private static final String serviceEndpoint = "dynamodb.eu-central-1.amazonaws.com";

  private static final String accessKey = "AKIAVRUVP3AMDBE5F674";

  private static final String secretKey = "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";

  private static final String signInRegion = "eu-central-1";

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
