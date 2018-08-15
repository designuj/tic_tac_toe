package pl.designuj.play.tictactoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.services.*;

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
    public void makeMove(@RequestParam Long location) {
        System.out.println("Move request to location " + location + ".");
        gameService.makeMove(location.intValue());
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
