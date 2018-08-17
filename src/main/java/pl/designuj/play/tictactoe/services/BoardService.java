package pl.designuj.play.tictactoe.services;

import org.springframework.stereotype.Service;
import pl.designuj.play.tictactoe.model.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    private final Integer BOARD_CAPACITY = 9;

    private Character currentPlayer = 'o';
    private Integer currentBoard = 4;

    private List<Board> boardsInGame = new ArrayList<>();

    public BoardService() {
        refresh(' ');
    }

    public void refresh(Character player) {
        for (int i = 0; i < 9; i++) {
            boardsInGame.add(new Board());
        }
    }

    public Boolean isGameFinish() {
        boolean full = false;

        for (Board boardInGame : boardsInGame) {
            for (Character charInBoard : boardInGame.getCharsInBoard() ) {
                if (charInBoard == ' ') {
                    full = true;
                    break;
                }
                break;
            }
        }

        return full;
    }

    public void makeMove(Integer location) {
        if (boardsInGame.get(currentBoard).getCharsInBoard().get(location) != ' ') {
            boardsInGame.get(currentBoard).getCharsInBoard().set(location, currentPlayer);
        }
        switchUser();
        switchBoard(location);
    }

    public void switchUser() {
        if (currentPlayer == 'o') {
            currentPlayer = 'x';
        } else if (currentPlayer == 'x') {
            currentPlayer = 'o';
        }
    }

    public void switchBoard(Integer location) {
        currentBoard = location;
    }

    public Character checkForWin() {
        for (int i = 0; i < 9; i++) {
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
                for (Board aBoardsInGame : boardsInGame) {
                    aBoardsInGame.setWholeBoard('o');
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
                for (Board aBoardsInGame : boardsInGame) {
                    aBoardsInGame.setWholeBoard('x');
                }
            }
        }
        return ' ';
    }

    public Character getPlayer() {
        return currentPlayer;
    }

    public Integer getBoard() {
        return currentBoard;
    }

    public List<Board> getBoardsInGame() {
        return boardsInGame;
    }
}
