import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    @Before
    public void initialisation() {

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
    public void testMoreMoves() throws FullBoardException, LocationNotAvailableException {
        //Given
        Game game = new Game();

        //When
        game.move('x', 4);
        game.move('o', 0);
        game.move('x', 1);
        game.move('o', 3);

        //Then

    }
}
