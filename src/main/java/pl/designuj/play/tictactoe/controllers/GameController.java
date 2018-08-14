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

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PutMapping("/new")
    public void createNewGame(@RequestBody Boolean confirm) {
        gameService.createNewGame(confirm);
        System.out.println("heheszki");
    }

    @PutMapping("/move")
    public void makeMove(@RequestBody Integer location) {
        gameService.makeMove(location);
        System.out.println("heheszki");
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Board> getCurrentGame() {
        System.out.println("heheszki");
        return gameService.getCurrentGame();
    }

    @GetMapping("/who")
    @ResponseBody
    public Character whoShouldMove() {
        System.out.println("heheszki");
        return gameService.whoShouldMove();
    }
}
