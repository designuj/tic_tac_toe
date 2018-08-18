package pl.designuj.play.tictactoe.services;

import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.model.Move;

import java.util.List;

public interface GameAPI {
    void createNewGame(Boolean confirm);
    List<Board> getCurrentGame();
    Move getNextMove();
    void makeMove(Integer location, Character player);
    Character getWinner();
}
