package fii.wade.botaniq;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackEndApplication {

  public static void main(String[] args) {

    SpringApplication.run(BackEndApplication.class, args);
  }

  @Bean
  public Function<String, String> hello() {

    return name -> String.format("Hello %s!", name);
  }
}
