package fii.wade.botaniq.controller;

import fii.wade.botaniq.model.User;
import fii.wade.botaniq.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UsersController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/{username}")
    public ResponseEntity<User> getUser(@PathVariable("username") String username){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userRepository.addUser(user), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{username}")
    public ResponseEntity<User> updateUser(@PathVariable("username") String id, @RequestBody User user){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable("userId") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/email")
    public ResponseEntity<User> getUsersByEmail(@RequestBody String email){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = "/phone")
    public ResponseEntity<User> getUsersByPhone(@RequestBody String phone){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
