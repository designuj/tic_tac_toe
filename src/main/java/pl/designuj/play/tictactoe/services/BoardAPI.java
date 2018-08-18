package pl.designuj.play.tictactoe.services;

import pl.designuj.play.tictactoe.model.*;

import java.util.List;

public interface BoardAPI {
    void refresh();
    Boolean isGameFinish();
    void makeMove(Integer location);
    void switchUser();
    void switchBoard(Integer location);
    Character checkForWin();
    Character getCurrentPlayer();
    Integer getCurrentBoard();
    void setWinner(Character winner);
    List<Board> getBoardsInGame();
}
