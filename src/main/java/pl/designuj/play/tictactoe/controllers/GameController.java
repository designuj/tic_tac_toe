package pl.designuj.play.tictactoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.services.GameService;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PutMapping("/new")
    public void createNewGame(@RequestParam Boolean confirm) {
        System.out.println("New game request.");
        gameService.createNewGame(confirm);
    }

    @PutMapping("/move")
    public void makeMove(@RequestParam Integer location) {
        System.out.println("Move request to location " + location + ".");
        gameService.makeMove(location-1);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Board> getCurrentGame() {
        System.out.println("Check game status request.");
        return gameService.getCurrentGame();
    }

    @GetMapping("/who")
    @ResponseBody
    public Character whoShouldMove() {
        System.out.println("Check current player request.");
        return gameService.whoShouldMove();
    }
}
