package pl.designuj.play.tictactoe.services;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.Board;

import java.util.ArrayList;
import java.util.List;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
public class BoardService implements BoardAPI {
    private Character currentPlayer = FIRST_PLAYER;
    private Integer currentBoard = FIRST_BOARD;
    private Character winner = EMPTY_LOCATION;

    private List<Board> boardsInGame = new ArrayList<>();

    public BoardService() {
        refresh();
    }

    public void refresh() {
        for (int i = BOARD_FIRST_INDEX; i <= BOARD_LAST_INDEX; i++) {
            boardsInGame.add(new Board());
        }
    }

    public Boolean isGameFinish() {
        boolean full = false;

        for (Board boardInGame : boardsInGame) {
            for (Character charInBoard : boardInGame.getCharsInBoard() ) {
                if (charInBoard == EMPTY_LOCATION) {
                    full = true;
                    break;
                }
                break;
            }
        }

        return full;
    }

    public void makeMove(Integer location) {
        if (boardsInGame.get(currentBoard).getCharsInBoard().get(location) == ' ') {
            boardsInGame.get(currentBoard).getCharsInBoard().set(location, currentPlayer);
            switchUser();
            switchBoard(location);
            setWinner(checkForWin());
        }
    }

    public void switchUser() {
        if (currentPlayer == FIRST_PLAYER) {
            currentPlayer = SECOND_PLAYER;
        } else if (currentPlayer == SECOND_PLAYER) {
            currentPlayer = FIRST_PLAYER;
        }
    }

    public void switchBoard(Integer location) {
        currentBoard = location;
    }

    public Character checkForWin() {
        for (int i = BOARD_FIRST_INDEX; i <= BOARD_LAST_INDEX; i++) {
            if (
                            boardsInGame.get(i).getCharsInBoard().get(0) == 'o' && boardsInGame.get(i).getCharsInBoard().get(1) == 'o' && boardsInGame.get(i).getCharsInBoard().get(2) == 'o' ||
                            boardsInGame.get(i).getCharsInBoard().get(3) == 'o' && boardsInGame.get(i).getCharsInBoard().get(4) == 'o' && boardsInGame.get(i).getCharsInBoard().get(5) == 'o' ||
                            boardsInGame.get(i).getCharsInBoard().get(6) == 'o' && boardsInGame.get(i).getCharsInBoard().get(7) == 'o' && boardsInGame.get(i).getCharsInBoard().get(8) == 'o' ||

                            boardsInGame.get(i).getCharsInBoard().get(0) == 'o' && boardsInGame.get(i).getCharsInBoard().get(3) == 'o' && boardsInGame.get(i).getCharsInBoard().get(6) == 'o' ||
                            boardsInGame.get(i).getCharsInBoard().get(1) == 'o' && boardsInGame.get(i).getCharsInBoard().get(4) == 'o' && boardsInGame.get(i).getCharsInBoard().get(7) == 'o' ||
                            boardsInGame.get(i).getCharsInBoard().get(2) == 'o' && boardsInGame.get(i).getCharsInBoard().get(5) == 'o' && boardsInGame.get(i).getCharsInBoard().get(8) == 'o' ||

                            boardsInGame.get(i).getCharsInBoard().get(0) == 'o' && boardsInGame.get(i).getCharsInBoard().get(4) == 'o' && boardsInGame.get(i).getCharsInBoard().get(8) == 'o' ||
                            boardsInGame.get(i).getCharsInBoard().get(2) == 'o' && boardsInGame.get(i).getCharsInBoard().get(4) == 'o' && boardsInGame.get(i).getCharsInBoard().get(6) == 'o'
            ) {
                for (Board boardInGame : boardsInGame) {
                    boardInGame.setWinnerInBoard(FIRST_PLAYER);
                }
            } else if (
                            boardsInGame.get(i).getCharsInBoard().get(0) == 'x' && boardsInGame.get(i).getCharsInBoard().get(1) == 'x' && boardsInGame.get(i).getCharsInBoard().get(2) == 'x' ||
                            boardsInGame.get(i).getCharsInBoard().get(3) == 'x' && boardsInGame.get(i).getCharsInBoard().get(4) == 'x' && boardsInGame.get(i).getCharsInBoard().get(5) == 'x' ||
                            boardsInGame.get(i).getCharsInBoard().get(6) == 'x' && boardsInGame.get(i).getCharsInBoard().get(7) == 'x' && boardsInGame.get(i).getCharsInBoard().get(8) == 'x' ||

                            boardsInGame.get(i).getCharsInBoard().get(0) == 'x' && boardsInGame.get(i).getCharsInBoard().get(3) == 'x' && boardsInGame.get(i).getCharsInBoard().get(6) == 'x' ||
                            boardsInGame.get(i).getCharsInBoard().get(1) == 'x' && boardsInGame.get(i).getCharsInBoard().get(4) == 'x' && boardsInGame.get(i).getCharsInBoard().get(7) == 'x' ||
                            boardsInGame.get(i).getCharsInBoard().get(2) == 'x' && boardsInGame.get(i).getCharsInBoard().get(5) == 'x' && boardsInGame.get(i).getCharsInBoard().get(8) == 'x' ||

                            boardsInGame.get(i).getCharsInBoard().get(0) == 'x' && boardsInGame.get(i).getCharsInBoard().get(4) == 'x' && boardsInGame.get(i).getCharsInBoard().get(8) == 'x' ||
                            boardsInGame.get(i).getCharsInBoard().get(2) == 'x' && boardsInGame.get(i).getCharsInBoard().get(4) == 'x' && boardsInGame.get(i).getCharsInBoard().get(6) == 'x'
            ) {
                for (Board boardInGame : boardsInGame) {
                    boardInGame.setWinnerInBoard(SECOND_PLAYER);
                }
            }
        }

        if (
                    boardsInGame.get(0).getWinner() == 'x' && boardsInGame.get(1).getWinner() == 'x' && boardsInGame.get(2).getWinner() == 'x' ||
                    boardsInGame.get(3).getWinner() == 'x' && boardsInGame.get(4).getWinner() == 'x' && boardsInGame.get(5).getWinner() == 'x' ||
                    boardsInGame.get(6).getWinner() == 'x' && boardsInGame.get(7).getWinner() == 'x' && boardsInGame.get(8).getWinner() == 'x' ||

                    boardsInGame.get(0).getWinner() == 'x' && boardsInGame.get(3).getWinner() == 'x' && boardsInGame.get(6).getWinner() == 'x' ||
                    boardsInGame.get(1).getWinner() == 'x' && boardsInGame.get(4).getWinner() == 'x' && boardsInGame.get(7).getWinner() == 'x' ||
                    boardsInGame.get(2).getWinner() == 'x' && boardsInGame.get(5).getWinner() == 'x' && boardsInGame.get(8).getWinner() == 'x' ||

                    boardsInGame.get(0).getWinner() == 'x' && boardsInGame.get(4).getWinner() == 'x' && boardsInGame.get(8).getWinner() == 'x' ||
                    boardsInGame.get(2).getWinner() == 'x' && boardsInGame.get(4).getWinner() == 'x' && boardsInGame.get(6).getWinner() == 'x'
        ) {
            return  SECOND_PLAYER;
        } else if (
                        boardsInGame.get(0).getWinner() == 'o' && boardsInGame.get(1).getWinner() == 'o' && boardsInGame.get(2).getWinner() == 'o' ||
                        boardsInGame.get(3).getWinner() == 'o' && boardsInGame.get(4).getWinner() == 'o' && boardsInGame.get(5).getWinner() == 'o' ||
                        boardsInGame.get(6).getWinner() == 'o' && boardsInGame.get(7).getWinner() == 'o' && boardsInGame.get(8).getWinner() == 'o' ||

                        boardsInGame.get(0).getWinner() == 'o' && boardsInGame.get(3).getWinner() == 'o' && boardsInGame.get(6).getWinner() == 'o' ||
                        boardsInGame.get(1).getWinner() == 'o' && boardsInGame.get(4).getWinner() == 'o' && boardsInGame.get(7).getWinner() == 'o' ||
                        boardsInGame.get(2).getWinner() == 'o' && boardsInGame.get(5).getWinner() == 'o' && boardsInGame.get(8).getWinner() == 'o' ||

                        boardsInGame.get(0).getWinner() == 'o' && boardsInGame.get(4).getWinner() == 'o' && boardsInGame.get(8).getWinner() == 'o' ||
                        boardsInGame.get(2).getWinner() == 'o' && boardsInGame.get(4).getWinner() == 'o' && boardsInGame.get(6).getWinner() == 'o'

        ) {
            return FIRST_PLAYER;
        } else {
            return EMPTY_LOCATION;
        }
    }

    public Character getCurrentPlayer() {
        return currentPlayer;
    }

    public Integer getCurrentBoard() {
        return currentBoard;
    }

    public void setWinner(Character winner) {
        this.winner = winner;
    }

    public List<Board> getBoardsInGame() {
        return boardsInGame;
    }
}
