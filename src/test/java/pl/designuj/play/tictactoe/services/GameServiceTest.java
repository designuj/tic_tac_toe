package pl.designuj.play.tictactoe.services;

import org.junit.Before;
import org.junit.Test;

public class GameServiceTest {

    GameService gameService;

    @Before
    public void setUp() throws Exception {
        gameService = new GameService(new BoardService());
    }

    @Test
    public void createGame() {

    }

    @Test
    public void makeMove() {

    }
}