package fii.wade.botaniq;

import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.services.lambda.runtime.Context;
import fii.wade.botaniq.handler.LambdaHandler;
import java.util.function.BiFunction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackEndApplication {

  private static final LambdaHandler lambdaHandler = new LambdaHandler();

  public static void main(String[] args) {

    SpringApplication.run(BackEndApplication.class, args);
  }

  @Bean
  public BiFunction<AwsProxyRequest, Context, AwsProxyResponse> handler() {

    return lambdaHandler::handleRequest;
  }
}
