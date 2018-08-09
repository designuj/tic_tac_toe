package pl.designuj.play.tictactoe.service;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;

import java.util.List;

@Service
public class GameService implements GameAPI {
    private BoardService boardService;

    public GameService(BoardService boardService) {
        this.boardService = boardService;
    }

    @Override
    public void createNewGame(Boolean confirm) {
        if (confirm) {
            boardService.refresh();
        }
    }

    @Override
    public List<Board> getCurrentGame() {
        return boardService.getGame();
    }

    @Override
    public Character whoShouldMove() {
        return boardService.getPlayer();
    }

    @Override
    public void makeMove(Integer location) {
        if (location > 0 && location < 10)
        boardService.makeMove(location);
    }
}
