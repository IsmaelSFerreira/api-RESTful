package dio.innovation.api_RESTful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.innovation.api_RESTful.model.Games;
import dio.innovation.api_RESTful.repository.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public GameService() {
    }

    public Games saveGame(Games games) {
        return (Games)this.gameRepository.save(games);
    }

    public List<Games> gamePerUser(Long userId) {
        return this.gameRepository.findByUserId(userId);
    }

    public void deleteGame(Long gameId) {
        this.gameRepository.deleteById(gameId);
    }
}
