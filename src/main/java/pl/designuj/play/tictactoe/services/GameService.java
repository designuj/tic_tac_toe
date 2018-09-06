package pl.designuj.play.tictactoe.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.configuration.GameNotAvailableException;
import pl.designuj.play.tictactoe.configuration.WrongMoveException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
@Getter
@Setter
public class GameService {

    private BoardService boardService;
    private List<Map<Integer, Character>> boards;
    private List<Character> boardsWins;

    public GameService(BoardService boardService) {
        this.boardService = boardService;
    }

    public List<Map<Integer, Character>> createGame(Boolean confirm) {
        if (confirm) {
            setToNew();

            for (int i = BOARD_FIRST_INDEX; i <= BOARD_LAST_INDEX; i++) {
                boardsWins.add(EMPTY_LOCATION);
                boards.add(new HashMap<>());
                for (int j = BOARD_FIRST_INDEX; j <= BOARD_LAST_INDEX; j++) {
                    boards.get(i).put(j, EMPTY_LOCATION);
                }
            }
            return boards;
        } else {
            throw new GameNotAvailableException();
        }
    }

    public List<Map<Integer, Character>> makeMove(Character player, Integer location)  {
        location -= PRESET_COUNTING;

        if (boardService.getGameWinner() == null) {
            if (player == boardService.getCurrentPlayer() &&
                    boardsWins.get(boardService.getCurrentBoard()) == null &&
                    boards.get(boardService.getCurrentBoard()).get(location) == null) {
                boards.get(boardService.getCurrentBoard()).replace(location, player);

                if (boardService.checkCurrentBoard(boards.get(boardService.getCurrentBoard()))) {
                    boardsWins.set(boardService.getCurrentBoard(), player);
                    boardService.checkAllBoards(boardsWins);
                }

                boardService.switchUser();
                boardService.switchBoard(location);
            } else {
                throw new WrongMoveException();
            }
        } else {
            throw new GameNotAvailableException();
        }

        return boards;
    }

    private void setToNew() {
        boards = new ArrayList<>();
        boardsWins = new ArrayList<>();
        boardService.setCurrentBoard(FIRST_BOARD);
        boardService.setCurrentPlayer(FIRST_PLAYER);
        boardService.setGameWinner(null);
    }
}
