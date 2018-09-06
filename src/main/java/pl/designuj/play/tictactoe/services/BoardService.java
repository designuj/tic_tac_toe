package pl.designuj.play.tictactoe.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.configuration.GameNotAvailableException;

import java.util.List;
import java.util.Map;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
@Getter
@Setter
@NoArgsConstructor
public class BoardService {

    private Character gameWinner;
    private Character currentPlayer;
    private Integer currentBoard;

    public void switchUser() {
        if (currentPlayer == FIRST_PLAYER) {
            currentPlayer = SECOND_PLAYER;
        } else {
            currentPlayer = FIRST_PLAYER;
        }
    }

    public void switchBoard(Integer location) {
        currentBoard = location;
    }

    public boolean checkCurrentBoard(Integer location, Map<Integer, Character> board) {
        Boolean win = Boolean.FALSE;

        switch (location) {
            case 0:
                if (
                        (board.get(1) == currentPlayer && board.get(2) == currentPlayer) ||
                        (board.get(3) == currentPlayer && board.get(6) == currentPlayer) ||
                        (board.get(4) == currentPlayer && board.get(8) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                };
            case 1:
                if (
                        (board.get(0) == currentPlayer && board.get(2) == currentPlayer) ||
                        (board.get(4) == currentPlayer && board.get(7) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
            case 2:
                if (
                        (board.get(0) == currentPlayer && board.get(1) == currentPlayer) ||
                        (board.get(5) == currentPlayer && board.get(8) == currentPlayer) ||
                        (board.get(4) == currentPlayer && board.get(6) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
            case 3:
                if (
                        (board.get(5) == currentPlayer && board.get(6) == currentPlayer) ||
                        (board.get(0) == currentPlayer && board.get(6) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
            case 4:
                if (
                        (board.get(0) == currentPlayer && board.get(8) == currentPlayer) ||
                        (board.get(2) == currentPlayer && board.get(6) == currentPlayer) ||
                        (board.get(1) == currentPlayer && board.get(7) == currentPlayer) ||
                        (board.get(3) == currentPlayer && board.get(5) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
            case 5:
                if (
                        (board.get(2) == currentPlayer && board.get(8) == currentPlayer) ||
                        (board.get(3) == currentPlayer && board.get(4) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
            case 6:
                if (
                        (board.get(0) == currentPlayer && board.get(3) == currentPlayer) ||
                        (board.get(2) == currentPlayer && board.get(4) == currentPlayer) ||
                        (board.get(7) == currentPlayer && board.get(8) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                };
            case 7:
                if (
                        (board.get(1) == currentPlayer && board.get(4) == currentPlayer) ||
                        (board.get(6) == currentPlayer && board.get(8) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
            case 8:
                if (
                        (board.get(6) == currentPlayer && board.get(7) == currentPlayer) ||
                        (board.get(2) == currentPlayer && board.get(5) == currentPlayer) ||
                        (board.get(0) == currentPlayer && board.get(4) == currentPlayer)
                ) {
                    win = Boolean.TRUE;
                }
        }
        if (win) {
            setBoardToWin(board);
        }
        return win;
    }

    private void setBoardToWin(Map<Integer, Character> board) {
        for (int i = BOARD_FIRST_INDEX; i < board.size(); i++) {
            board.put(i, currentPlayer);
        }
    }

    public void checkAllBoards(List<Character> board) {
        switch (currentBoard) {
            case 0:
                if (
                        (board.get(1) == currentPlayer && board.get(2) == currentPlayer) ||
                        (board.get(3) == currentPlayer && board.get(6) == currentPlayer) ||
                        (board.get(4) == currentPlayer && board.get(8) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                };
            case 1:
                if (
                        (board.get(0) == currentPlayer && board.get(2) == currentPlayer) ||
                        (board.get(4) == currentPlayer && board.get(7) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
            case 2:
                if (
                        (board.get(0) == currentPlayer && board.get(1) == currentPlayer) ||
                        (board.get(5) == currentPlayer && board.get(8) == currentPlayer) ||
                        (board.get(4) == currentPlayer && board.get(6) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
            case 3:
                if (
                        (board.get(5) == currentPlayer && board.get(6) == currentPlayer) ||
                        (board.get(0) == currentPlayer && board.get(6) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
            case 4:
                if (
                        (board.get(0) == currentPlayer && board.get(8) == currentPlayer) ||
                        (board.get(2) == currentPlayer && board.get(6) == currentPlayer) ||
                        (board.get(1) == currentPlayer && board.get(7) == currentPlayer) ||
                        (board.get(3) == currentPlayer && board.get(5) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
            case 5:
                if (
                        (board.get(2) == currentPlayer && board.get(8) == currentPlayer) ||
                        (board.get(3) == currentPlayer && board.get(4) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
            case 6:
                if (
                        (board.get(0) == currentPlayer && board.get(3) == currentPlayer) ||
                        (board.get(2) == currentPlayer && board.get(4) == currentPlayer) ||
                        (board.get(7) == currentPlayer && board.get(8) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                };
            case 7:
                if (
                        (board.get(1) == currentPlayer && board.get(4) == currentPlayer) ||
                        (board.get(6) == currentPlayer && board.get(8) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
            case 8:
                if (
                        (board.get(6) == currentPlayer && board.get(7) == currentPlayer) ||
                        (board.get(2) == currentPlayer && board.get(5) == currentPlayer) ||
                        (board.get(0) == currentPlayer && board.get(4) == currentPlayer)
                ) {
                    gameWinner = currentPlayer;
                }
        }
    }
}
