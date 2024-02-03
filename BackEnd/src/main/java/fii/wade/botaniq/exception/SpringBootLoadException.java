package fii.wade.botaniq.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SpringBootLoadException extends RuntimeException {

  public SpringBootLoadException(String message) {
    super(message);
  }

  public SpringBootLoadException(String message, Throwable cause) {
    super(message, cause);
  }

  public SpringBootLoadException(Throwable cause) {
    super(cause);
  }
}
