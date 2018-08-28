package pl.designuj.play.tictactoe.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.designuj.play.tictactoe.services.BoardService;
import pl.designuj.play.tictactoe.services.GameService;

import static org.junit.Assert.*;

public class GameControllerTest {

    @Before
    public void setUp() {

    }

    @Test
    public void createGame() {
        //Given
        GameController gameController = new GameController(new GameService(new BoardService()));

        //When
        gameController.createGame(true);

        //Then
        assertEquals(gameController.getBoards().size(), 9);
    }

    @Test
    public void makeMove() {
        //Given
        GameController gameController = new GameController(new GameService(new BoardService()));

        //When
        gameController.makeMove('o', 5);

        //Then
        //assertEquals(gameController.getBoards().get(4));
    }

    @Test
    public void getBoards() {
    }

    @Test
    public void getWins() {
    }
}