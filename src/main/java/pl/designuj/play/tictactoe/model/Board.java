package pl.designuj.play.tictactoe.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Board {
    private List<Character> boards = new ArrayList<>(9);

    private void setBoardToWin(Character player) {
        for (int i = 0; i < boards.size(); i++) {
            boards.set(i, player);
        }
    }
}
