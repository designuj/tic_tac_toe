package pl.designuj.play.tictactoe.services;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BoardServiceTest {

    BoardService boardService;

    @Before
    public void setUp() {
        boardService = new BoardService();
    }

    @Test
    public void switchUser() {
        //Given
        boardService.setCurrentPlayer('o');

        //When
        boardService.switchUser();

        //Then
        assertEquals(java.util.Optional.of('x').get(), boardService.getCurrentPlayer());
    }

    @Test
    public void switchBoard() {
        //Given
        boardService.setCurrentBoard(4);
        Integer location = 1;

        //When
        boardService.switchBoard(location);

        //Then
        assertEquals(location, boardService.getCurrentBoard());
    }

    @Test
    public void checkCurrentBoard() {
        //Given
        Map<Integer, Character> smallBoard = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            smallBoard.put(i, ' ');
        }

        //When
        boardService.setCurrentPlayer('o');
        smallBoard.replace(0, 'o');
        smallBoard.replace(1, 'o');
        smallBoard.replace(2, 'o');
        //Boolean doesBoardHasAWinner = boardService.checkCurrentBoard(smallBoard);

        //Then
        //assertEquals(true, doesBoardHasAWinner);
    }

    @Test
    public void checkAllBoards() {
        //Given
        List<Character> boardsWins = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            boardsWins.add(' ');
        }

        //When
        boardService.setCurrentPlayer('o');
        boardsWins.set(0, 'o');
        boardsWins.set(1, 'o');
        boardsWins.set(2, 'o');
        boardService.checkAllBoards(boardsWins);

        //Then
        assertEquals(java.util.Optional.of('o').get(), boardService.getGameWinner());
    }
}