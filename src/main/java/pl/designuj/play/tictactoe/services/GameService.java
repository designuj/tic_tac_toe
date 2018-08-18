package pl.designuj.play.tictactoe.services;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.model.Move;

import java.util.List;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.BOARD_FIRST_INDEX;
import static pl.designuj.play.tictactoe.configuration.GameConfiguration.BOARD_LAST_INDEX;

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
        return boardService.getBoardsInGame();
    }

    @Override
    public Move getNextMove() {
        return new Move(boardService.getCurrentPlayer(), boardService.getCurrentBoard()+1);
    }

    @Override
    public void makeMove(Integer location, Character player) {
        if ((location >= BOARD_FIRST_INDEX && location <= BOARD_LAST_INDEX) && (player == boardService.getCurrentPlayer())) {
            boardService.makeMove(location);
        }
    }

    @Override
    public Character getWinner() {
        return boardService.checkForWin();
    }
}
