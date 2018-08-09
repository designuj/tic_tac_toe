package pl.designuj.play.tictactoe.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Board {
    public static Integer BOARD_CAPACITY = 9;
    public static final Character playerX = 'x';
    public static final Character playerO = 'o';

    private List<Character> boards = new ArrayList<>(BOARD_CAPACITY);
    private Boolean boardFull;

    private void setBoardToWin(Character player) {
        for (int i = 0; i < boards.size(); i++) {
            boards.set(i, player);
        }
    }

    private Boolean isBoardFull(Integer location) {
        return true;
    }

    private List<Character> getBoards() {
        return boards;
    }
}
