package pl.designuj.play.tictactoe.services;

import pl.designuj.play.tictactoe.model.Board;

import java.util.List;

public interface BoardAPI {
    void reset();
    void makeMove(Integer location);
    void switchUser();
    void switchBoard(Integer location);
    Character checkForWin();
    Character getCurrentPlayer();
    Integer getCurrentBoard();
    void setWinner(Character winner);
    List<Board> getBoardsInGame();
}
