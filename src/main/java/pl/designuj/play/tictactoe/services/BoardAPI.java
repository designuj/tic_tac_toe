package pl.designuj.play.tictactoe.services;

import pl.designuj.play.tictactoe.model.Board;

import java.util.List;

public interface BoardAPI {
    void refresh();
    Boolean isGameFinish();
    List<Board> getGame();
    Character whoShouldMove();
    void makeMove(Integer location);
    Character getPlayer();
}
