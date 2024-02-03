package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.User;
import fii.wade.botaniq.service.impl.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UsersController extends BaseController<User, UserService> {}
