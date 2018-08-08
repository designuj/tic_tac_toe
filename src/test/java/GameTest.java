import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    @Before
    public void initialisation() {
        //each board chars:
        //  0  4  8
        // 10 14 18
        // 20 24 28
    }


    @Test
    public void testFirstMove() throws FullBoardException, LocationNotAvailableException {
        //Given
        Game game = new Game();

        //When
        game.move('x', 4);

        //Then
        Assert.assertEquals('x', game.getBoardArray()[1][1].toString().charAt(14));
    }

    @Test
    public void testWinMoves() throws FullBoardException, LocationNotAvailableException {
        //Given
        Game game = new Game();

        //When
        game.move('x', 0);
        game.move('o', 4);
        game.move('x', 1);
        game.move('o', 4);
        game.move('x', 2);

        //Then
        boolean resultOfBoard =
                        game.getBoardArray()[1][1].toString().charAt(0) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(4) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(8) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(10) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(14) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(18) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(20) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(24) == ('x') &&
                        game.getBoardArray()[1][1].toString().charAt(28) == ('x');

        Assert.assertEquals(true, resultOfBoard);
    }
}
