package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.entry.impl.User;
import fii.wade.botaniq.service.impl.UserService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/users")
public class UsersController extends BaseController<User, UserService> {
  public UsersController(UserService service) {
    super(service);
  }
}
