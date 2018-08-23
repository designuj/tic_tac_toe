package pl.designuj.play.tictactoe.services;

import java.util.List;
import java.util.Map;

public interface GameAPI {
    List<Map<Integer, Character>> createGame(Boolean confirm);
    List<Map<Integer, Character>> makeMove(Character player, Integer location);
}
