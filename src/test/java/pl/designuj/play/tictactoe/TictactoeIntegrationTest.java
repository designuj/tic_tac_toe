package pl.designuj.play.tictactoe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import pl.designuj.play.tictactoe.controllers.GameController;

@RunWith(SpringRunner.class)
public class TictactoeIntegrationTest {

    @Autowired
    GameController gameController;

    @Test
    public void setUp() {

    }

    @Test
    public void testWinBattle() {
        //gameController.makeMove();
    }
}
