package pl.designuj.play.tictactoe.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;

import java.util.ArrayList;
import java.util.List;

import static pl.designuj.play.tictactoe.model.Board.BOARD_CAPACITY;

@Service
public class BoardService {

    private List<Board> game = new ArrayList<>(BOARD_CAPACITY);

    public BoardService() {
    }

    private boolean isGameFinish() {

        return true;
    }

    public void refresh() {
        game = new ArrayList<>(BOARD_CAPACITY);
    }

    public List<Board> getGame() {

        return game;
    }

    public Character getPlayer() {

        return 'o';
    }

    public void makeMove(Integer location) {
    }
}
