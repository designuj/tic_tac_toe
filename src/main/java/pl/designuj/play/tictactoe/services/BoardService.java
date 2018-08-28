package pl.designuj.play.tictactoe.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
@Getter
@Setter
@NoArgsConstructor
public class BoardService {

    private Character currentPlayer = FIRST_PLAYER;
    private Integer currentBoard = FIRST_BOARD;
    private Character winner = EMPTY_LOCATION;

    public void switchUser(Character player) {
        if (player == FIRST_PLAYER) {
            currentPlayer = SECOND_PLAYER;
        } else {
            currentPlayer = FIRST_PLAYER;
        }
    }

    public void switchBoard(Integer location) {
        currentBoard = location;
    }

    public boolean checkCurrentBoard(Map<Integer, Character> board) {
        Boolean win = false;

        for (int i = BOARD_FIRST_INDEX; i < WIN_SCHEMA.size(); i++) {
            if (board.get(WIN_SCHEMA.get(i)[ITERATOR_1]) == currentPlayer && board.get(WIN_SCHEMA.get(i)[ITERATOR_2]) == currentPlayer && board.get(WIN_SCHEMA.get(i)[ITERATOR_3]) == currentPlayer) {
                win = true;

                setBoardToWin(board);
            }
        }

        return win;
    }

    private void setBoardToWin(Map<Integer, Character> board) {
        for (int i = BOARD_FIRST_INDEX; i < board.size(); i++) {
            board.put(i, currentPlayer);
        }
    }

    public void checkAllBoards(List<Character> boardsWins) {
        for (int i = BOARD_FIRST_INDEX; i < WIN_SCHEMA.size(); i++) {
            if (boardsWins.get(WIN_SCHEMA.get(i)[ITERATOR_1]) == currentPlayer && boardsWins.get(WIN_SCHEMA.get(i)[ITERATOR_2]) == currentPlayer && boardsWins.get(WIN_SCHEMA.get(i)[ITERATOR_3]) == currentPlayer) {
                setWinner(currentPlayer);
            }
        }
    }
}
