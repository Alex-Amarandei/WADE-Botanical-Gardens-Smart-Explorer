package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.User;
import fii.wade.botaniq.repository.impl.UserRepository;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UsersController extends BaseController<User, UserRepository> {

  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/email")
  public ResponseEntity<User> getUsersByEmail(@RequestBody String email) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping(path = "/phone")
  public ResponseEntity<User> getUsersByPhone(@RequestBody String phone) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
