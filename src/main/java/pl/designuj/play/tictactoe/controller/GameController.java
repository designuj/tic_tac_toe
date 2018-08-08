package pl.designuj.play.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.service.GameService;
import pl.designuj.play.tictactoe.service.GameAPI;

@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PutMapping(value = "/new")
    public void createNewGame() {
        gameService.createNewGame();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Board getCurrentGame() {
        return gameService.getCurrentGame();
    }

    @PutMapping(value = "/move/{location}")
    public void makeMove(@PathVariable("location") int location) {
        gameService.makeMove(location);
    }
}
