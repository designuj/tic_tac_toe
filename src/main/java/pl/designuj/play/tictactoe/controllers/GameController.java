package pl.designuj.play.tictactoe.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.designuj.play.tictactoe.services.GameAPI;

import java.util.Map;

@RestController
@RequestMapping("/game")
@AllArgsConstructor
public class GameController {
    private GameAPI gameAPI;

    @PutMapping("/new")
    @ResponseBody
    public String createGame(@RequestParam Boolean confirm) {
        return gameAPI.createGame(confirm).toString();
    }

    @PutMapping("/move")
    @ResponseBody
    public String makeMove(@RequestParam Character player, @RequestParam Integer location) {
        return gameAPI.makeMove(player, location).toString();
    }

    @GetMapping("/get")
    @ResponseBody
    public String getBoards() {
        return gameAPI.getGame().toString();
    }
}
