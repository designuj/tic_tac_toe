package pl.designuj.play.tictactoe.service;

import pl.designuj.play.tictactoe.model.Board;

public interface GameAPI {
    void createNewGame();
    Board getCurrentGame();
    void makeMove(int location);
}
