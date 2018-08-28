package pl.designuj.play.tictactoe.controllers;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.designuj.play.tictactoe.services.GameService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/game")
@AllArgsConstructor
public class GameController {

    private GameService gameService;

    @PutMapping("/new")
    @ResponseBody
    public List<Map<Integer, Character>> createGame(@RequestParam Boolean confirm) {
        return gameService.createGame(confirm);
    }

    @PutMapping("/move")
    @ResponseBody
    public List<Map<Integer, Character>> makeMove(@RequestParam Character player, @RequestParam Integer location) {
        return gameService.makeMove(player, location);
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Map<Integer, Character>> getBoards() {
        return gameService.getBoards();
    }

    @GetMapping("/wins")
    @ResponseBody
    public List<Character> getWins() {
        return gameService.getBoardsWins();
    }
}
