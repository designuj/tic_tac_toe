package pl.designuj.play.tictactoe.services;

import pl.designuj.play.tictactoe.model.*;

import java.util.List;

public interface BoardAPI {
    void refresh();
    Boolean isGameFinish();
    List<Board> getGame();
    Character whoShouldMakeMove();
    void makeMove(Integer location);
    Character getPlayer();
}
