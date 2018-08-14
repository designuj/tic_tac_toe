package pl.designuj.play.tictactoe.services;

import pl.designuj.play.tictactoe.model.*;

import java.util.List;

public interface GameAPI {
    void createNewGame(Boolean confirm);
    List<Board> getCurrentGame();
    Character whoShouldMove();
    void makeMove(Integer location);
}
