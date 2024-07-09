package dio.innovation.api_RESTful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.innovation.api_RESTful.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
