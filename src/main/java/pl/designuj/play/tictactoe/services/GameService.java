package pl.designuj.play.tictactoe.services;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.model.Move;

import java.util.List;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.BOARD_FIRST_INDEX;
import static pl.designuj.play.tictactoe.configuration.GameConfiguration.BOARD_LAST_INDEX;

@Service
public class GameService implements GameAPI {

    private BoardAPI boardAPI;

    public GameService(BoardAPI boardService) {
        this.boardAPI = boardService;
    }

    @Overridegit
    public void createNewGame(Boolean confirm) {
        if (confirm) {
            boardAPI.reset();
        }
    }

    @Override
    public List<Board> getCurrentGame() {
        return boardAPI.getBoardsInGame();
    }

    @Override
    public Move getNextMove() {
        return new Move(boardAPI.getCurrentPlayer(), boardAPI.getCurrentBoard()+1);
    }

    @Override
    public void makeMove(Integer location, Character player) {
        if ((location >= BOARD_FIRST_INDEX && location <= BOARD_LAST_INDEX) && (player == boardAPI.getCurrentPlayer())) {
            boardAPI.makeMove(location);
        }
    }

    @Override
    public Character getWinner() {
        return boardAPI.checkForWin();
    }
}
