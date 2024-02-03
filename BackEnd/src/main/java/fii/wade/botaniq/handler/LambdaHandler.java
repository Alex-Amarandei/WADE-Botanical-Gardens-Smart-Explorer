package fii.wade.botaniq.handler;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import fii.wade.botaniq.BackEndApplication;
import fii.wade.botaniq.exception.SpringBootLoadException;

public class LambdaHandler implements RequestHandler<AwsProxyRequest, AwsProxyResponse> {
  private static final SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;

  static {
    try {
      handler = SpringBootLambdaContainerHandler.getAwsProxyHandler(BackEndApplication.class);
    } catch (ContainerInitializationException e) {
      throw new SpringBootLoadException("Unable to load spring boot application", e);
    }
  }

  @Override
  public AwsProxyResponse handleRequest(AwsProxyRequest input, Context context) {

    return handler.proxy(input, context);
  }
}
