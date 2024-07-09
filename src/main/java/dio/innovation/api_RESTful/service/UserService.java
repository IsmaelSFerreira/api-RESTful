package dio.innovation.api_RESTful.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.innovation.api_RESTful.model.User;
import dio.innovation.api_RESTful.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService() {
    }

    public User addUser(User user) {
        return (User)this.userRepository.save(user);
    }

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

    public Optional<User> getUserId(Long id) {
        return this.userRepository.findById(id);
    }
}
