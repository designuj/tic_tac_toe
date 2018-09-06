package pl.designuj.play.tictactoe.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.designuj.play.tictactoe.configuration.WrongMoveException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameControllerTest {

    @Autowired
    GameController gameController;

    @Before
    public void setUp() {
        gameController.createGame(true);
    }

    @Test
    public void createGame() {
        //Given


        //When
        Integer boardsCount = gameController.getBoards().size();

        //Then
        assertEquals(boardsCount.intValue(), 9);
    }

    @Test
    public void makeMove() {
        //Given

        //When
        gameController.makeMove('o', 5);

        //Then
        assertEquals((gameController.getBoards().get(4).get(4)).charValue(), 'o');
    }

    @Test(expected = WrongMoveException.class)
    public void makeMove_fieldNotEmpty() {
        //Given
        gameController.makeMove('o', 5);

        //When & Then
        gameController.makeMove('x', 5);
    }

    @Test
    public void getBoards() {
        //Given

        //When

        //Then
    }

    @Test
    public void getWins() {
        //Given

        //When
        gameController.makeMove('o', 4);
        gameController.makeMove('x', 5);
        gameController.makeMove('o', 6);
        gameController.makeMove('x', 5);
        gameController.makeMove('o', 5);

        //Then
        assertEquals(gameController.getWins().get(4).charValue(), 'o');
    }
}