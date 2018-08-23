package pl.designuj.play.tictactoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.model.Move;
import pl.designuj.play.tictactoe.services.GameAPI;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    private GameAPI gameAPI;

    @Autowired
    public GameController(GameAPI gameService) {
        this.gameAPI = gameService;
    }

    @PutMapping("/new")
    public void createNewGame(@RequestParam Boolean confirm) {
        gameAPI.createNewGame(confirm);
    }

    @PutMapping("/move")
    public void makeMove(@RequestParam Integer location, @RequestParam Character player) {
        gameAPI.makeMove(location-1, player);
    }

    @GetMapping("/show")
    @ResponseBody
    public List<Board> getCurrentGame() {
        return gameAPI.getCurrentGame();
    }

    @GetMapping("/next")
    @ResponseBody
    public Move getNextMove() {
        return gameAPI.getNextMove();
    }

    @GetMapping("/winner")
    @ResponseBody
    public Character whoWins() {
        return gameAPI.getWinner();
    }
}
