package pl.designuj.play.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

public class Board {

    private List<Character> charsInBoard = new ArrayList<>();
    private Character winner = EMPTY_LOCATION;

    public Board() {
        refresh(EMPTY_LOCATION);
    }

    public void refresh(Character player) {
        for (int i = BOARD_FIRST_INDEX; i <= BOARD_LAST_INDEX; i++) {
            charsInBoard.add(player);
        }
    }

    public List<Character> getCharsInBoard() {
        return charsInBoard;

    }

    public void setWinnerInBoard(Character player) {
        for (int i = BOARD_FIRST_INDEX; i <= BOARD_LAST_INDEX; i++) {
            charsInBoard.set(i, player);
        }
    }

    public Character getWinner() {
        return winner;
    }
}
