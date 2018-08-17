package pl.designuj.play.tictactoe;

import org.junit.*;
import pl.designuj.play.tictactoe.model.*;
import pl.designuj.play.tictactoe.services.*;

public class BoardTest {

    @Test
    public void testBoard() {
        BoardService boardService = new BoardService();
        boardService.getBoardsInGame().set(7, new Board());
    }
}
