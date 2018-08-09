package pl.designuj.play.tictactoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.services.*;

import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController {

    private final GameAPI gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PutMapping("/new/{confirm}")
    public void createNewGame(@PathVariable Boolean confirm) {
        gameService.createNewGame(confirm);
    }

    @PutMapping("/move/{location}")
    public void makeMove(@PathVariable Integer location) {
        gameService.makeMove(location);
    }

    @GetMapping
    @ResponseBody
    public List<Board> getCurrentGame() {
        return gameService.getCurrentGame();
    }

    @GetMapping
    @ResponseBody
    public Character whoShouldMove() {
        return gameService.whoShouldMove();
    }
}
