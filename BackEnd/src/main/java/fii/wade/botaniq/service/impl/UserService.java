package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.entry.impl.User;
import fii.wade.botaniq.repository.impl.UserRepository;
import fii.wade.botaniq.service.BaseService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService implements BaseService<User> {

  private UserRepository userRepository;

  @Override
  public User create(User user) {

    return userRepository.save(user);
  }

  @Override
  public Optional<User> read(String id) {

    return userRepository.findById(id, User.class);
  }

  @Override
  public Optional<User> update(String id, User user) {

    return userRepository.update(id, user, User.class);
  }

  @Override
  public void delete(String id) {

    userRepository.findById(id, User.class).ifPresent(user -> userRepository.delete(user));
  }

  @Override
  public List<User> getAll() {
    return userRepository.getAll(User.class);
  }
}
