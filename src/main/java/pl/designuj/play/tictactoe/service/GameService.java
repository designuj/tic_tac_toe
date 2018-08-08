package pl.designuj.play.tictactoe.service;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;

@Service
public class GameService implements GameAPI {
    private BoardService boardService;

    @Override
    public void createNewGame() {
        BoardService boardService = new BoardService();
        boardService.refresh();
    }

    @Override
    public Board getCurrentGame() {
        return null;
    }

    @Override
    public void makeMove(int location) {
    }
}
