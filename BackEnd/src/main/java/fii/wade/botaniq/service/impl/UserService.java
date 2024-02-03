package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.impl.User;
import fii.wade.botaniq.repository.impl.UserRepository;
import fii.wade.botaniq.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService implements BaseService<User> {

    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User read(String id) {
        return userRepository.findById(id, User.class).orElse(null);
    }

    @Override
    public User update(String id, User user) {
        return userRepository.updateById(id, user, User.class);
    }


    @Override
    public void delete(String id) {
    }
}
