package pl.designuj.play.tictactoe.services;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService implements BoardAPI {
    private final Integer BOARD_CAPACITY = 9;

    private List<Board> boardsInGame;

    public BoardService(List<Board> boardsInGame) {
        this.boardsInGame = boardsInGame;
    }

    @Override
    public void refresh() {
        boardsInGame = new ArrayList<>(BOARD_CAPACITY);
    }

    @Override
    public Boolean isGameFinish() {
        return null;
    }

    @Override
    public List<Board> getGame() {
        return null;
    }

    @Override
    public Character whoShouldMove() {
        return null;
    }

    @Override
    public void makeMove(Integer location) {

    }

    @Override
    public Character getPlayer() {
        return null;
    }
}
