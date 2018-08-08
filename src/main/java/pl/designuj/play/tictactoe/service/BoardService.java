package pl.designuj.play.tictactoe.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    private static int BOARD_CAPACITY = 9;

    private List<Board> game = new ArrayList<>(BOARD_CAPACITY);

    public BoardService() {
    }

    private boolean isGameFinish() {

        return true;
    }

    public void refresh() {
        game = new ArrayList<>(BOARD_CAPACITY);
    }
}
