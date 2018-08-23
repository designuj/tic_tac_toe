package pl.designuj.play.tictactoe.services;

public interface BoardAPI {
    void switchUser(Character player);
    void switchBoard(Integer location);
}
