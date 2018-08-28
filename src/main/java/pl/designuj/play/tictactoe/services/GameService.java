package pl.designuj.play.tictactoe.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

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
    private List<Map<Integer, Character>> boards = new ArrayList<>();
    private List<Character> boardsWins = new ArrayList<>();

    public GameService(BoardService boardService) {
        this.boardService = boardService;
    }

    public List<Map<Integer, Character>> createGame(Boolean confirm) {
        if (confirm) {
            for (int i = BOARD_FIRST_INDEX; i < BOARD_LAST_INDEX + PRESET_COUNTING; i++) {
                boards.add(new HashMap<>());
                boardsWins.add(null);
                for (int j = BOARD_FIRST_INDEX; j < BOARD_LAST_INDEX + PRESET_COUNTING; j++) {
                    boards.get(i).put(j, null);
                }
            }
            return boards;
        } else {
            return null;
        }
    }

    public List<Map<Integer, Character>> makeMove(Character player, Integer location)  {
        location -= PRESET_COUNTING;

        if (boardService.getWinner() == EMPTY_LOCATION) {
            if (player == boardService.getCurrentPlayer() && boardsWins.get(boardService.getCurrentBoard()) == null && boards.get(boardService.getCurrentBoard()).get(location) == null) {
                boards.get(boardService.getCurrentBoard()).replace(location, player);

                if (boardService.checkCurrentBoard(boards.get(boardService.getCurrentBoard()))) {
                    boardsWins.set(boardService.getCurrentBoard(), player);
                    boardService.checkAllBoards(boardsWins);
                }

                boardService.switchUser(player);
                boardService.switchBoard(location);
            }
        }

        return boards;
    }

    public List<Map<Integer, Character>> getBoards() {
        return boards;
    }
}
