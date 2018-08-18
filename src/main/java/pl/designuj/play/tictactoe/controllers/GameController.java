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
    public void makeMove(@RequestParam Integer location, @RequestParam Character player) {
        System.out.println("Move request to location " + location + " for player '" + player + "'.");
        gameService.makeMove(location-1, player);
    }

    @GetMapping("/show")
    @ResponseBody
    public List<Board> getCurrentGame() {
        System.out.println("Check game status request.");
        return gameService.getCurrentGame();
    }

    @GetMapping("/next")
    @ResponseBody
    public Move getNextMove() {
        System.out.println("Check current player request.");
        return gameService.getNextMove();
    }

    @GetMapping("/winner")
    @ResponseBody
    public Character whoWins() {
        System.out.println("Check for winner request.");
        return gameService.getWinner();
    }
}
