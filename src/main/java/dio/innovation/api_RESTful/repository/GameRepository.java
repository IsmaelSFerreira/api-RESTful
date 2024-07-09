package dio.innovation.api_RESTful.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.innovation.api_RESTful.model.Games;

public interface GameRepository extends JpaRepository<Games, Long> {
    List<Games> findByUserId(Long var1);
}
