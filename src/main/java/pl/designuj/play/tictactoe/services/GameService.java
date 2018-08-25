package pl.designuj.play.tictactoe.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
public class GameService {

    private BoardService boardService;

    public GameService(BoardService boardService) {
        this.boardService = boardService;
    }

    private List<Map<Integer, Character>> boards = new ArrayList<>();

    public List<Map<Integer, Character>> createGame(Boolean confirm) {
        if (confirm) {
            for (int i = BOARD_FIRST_INDEX; i < BOARD_LAST_INDEX + PRESET_COUNTING; i++) {
                boards.add(new HashMap<>());
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
        return null;
    }

    public List<Map<Integer, Character>> getBoards() {
        return boards;
    }
}
