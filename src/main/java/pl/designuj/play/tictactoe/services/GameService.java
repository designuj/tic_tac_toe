package pl.designuj.play.tictactoe.services;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.*;

import java.util.List;

@Service
public class GameService implements GameAPI {
    private final Integer BOARD_FIRST_INDEX = 0;
    private final Integer BOARD_LAST_INDEX = 8;

    private BoardService boardService;

    public GameService(BoardService boardService) {
        this.boardService = boardService;
    }

    @Override
    public void createNewGame(Boolean confirm) {
        if (confirm) {
            boardService.refresh(' ');
        }
    }

    @Override
    public List<Board> getCurrentGame() {
        return boardService.getBoardsInGame();
    }

    @Override
    public Character whoShouldMove() {
        return boardService.getPlayer();
    }

    @Override
    public void makeMove(Integer location) {
        if (location >= BOARD_FIRST_INDEX && location <= BOARD_LAST_INDEX)
        boardService.makeMove(location);
    }
}
