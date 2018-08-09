package pl.designuj.play.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.service.GameService;
import pl.designuj.play.tictactoe.service.GameAPI;

import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController {

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PutMapping(value = "/new/{confirm}")
    public void createNewGame(@PathVariable("confirm") Boolean confirm) {
        gameService.createNewGame(confirm);
    }

    @PutMapping(value = "/move/{location}")
    public void makeMove(@PathVariable("location") Integer location) {
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
