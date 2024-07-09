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

import dio.innovation.api_RESTful.model.Games;
import dio.innovation.api_RESTful.model.User;
import dio.innovation.api_RESTful.service.GameService;

@RestController
@RequestMapping({"/apiRest/games"})
public class GamesController {
    @Autowired
    GameService gameService;

    public GamesController() {
    }

    @PostMapping({"/{userId}"})
    public Games saveGame(@PathVariable Long userId, @RequestBody Games games) {
        games.setUser(new User(userId));
        return this.gameService.saveGame(games);
    }

    @GetMapping({"/{userId}"})
    public List<Games> findGamesByUserId(@PathVariable Long userId) {
        return this.gameService.gamePerUser(userId);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteGamesById(@PathVariable Long id) {
        this.gameService.deleteGame(id);
        return ResponseEntity.noContent().build();
    }
}
