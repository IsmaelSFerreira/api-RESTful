package dio.innovation.api_RESTful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.innovation.api_RESTful.model.User;
import dio.innovation.api_RESTful.service.UserService;

@RestController
@RequestMapping({"/apiRest/users"})
public class UserController {
    @Autowired
    UserService userService;

    public UserController() {
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<User> getUserbyId(@PathVariable Long id) {
        return (ResponseEntity)this.userService.getUserId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        this.userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}