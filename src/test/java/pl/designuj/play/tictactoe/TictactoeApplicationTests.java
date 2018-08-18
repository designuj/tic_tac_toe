package pl.designuj.play.tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.designuj.play.tictactoe.controllers.GameController;
import pl.designuj.play.tictactoe.model.Board;
import pl.designuj.play.tictactoe.services.BoardService;
import pl.designuj.play.tictactoe.services.GameService;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TictactoeApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void newBoardCheck() {
		//Given
		GameService gameService = new GameService(new BoardService());
		Boolean isBoardEmpty = true;

		//When
		for (Board boardInGame : gameService.getCurrentGame()) {
			for (Character characterInBoard : boardInGame.getCharsInBoard()) {
				if (characterInBoard != ' ') {
					isBoardEmpty = false;
				}
			}
		}

		//Then
		Assert.assertEquals(true, isBoardEmpty);
	}

	@Test
	public void wringCheckTest() {
		//Given
		GameService gameService = new GameService(new BoardService());
		char checkMove;

		//When
		gameService.makeMove(4, 'x');
		checkMove = gameService.getCurrentGame().get(4).getCharsInBoard().get(4);

		//Then
		Assert.assertEquals(' ', checkMove);
	}

	@Test
	public void correctMoveCheck() {
		//Given
		GameService gameService = new GameService(new BoardService());
		char checkMove;

		//When
		gameService.makeMove(4, 'o');
		checkMove = gameService.getCurrentGame().get(4).getCharsInBoard().get(4);

		//Then
		Assert.assertEquals('o', checkMove);
	}

	@Test
	public void middleBoardFillByO() {
		//Given
		GameService gameService = new GameService(new BoardService());
		Boolean isOnlyO = true;

		//When
		gameService.makeMove(0, 'o');
		gameService.makeMove(4, 'x');
		gameService.makeMove(1, 'o');
		gameService.makeMove(4, 'x');
		gameService.makeMove(2, 'o');

		for (Board boardInGame : gameService.getCurrentGame()) {
			for (Character characterInBoard : boardInGame.getCharsInBoard()) {
				if (characterInBoard != 'o') {
					isOnlyO = false;
				}
			}
		}

		//Then
		Assert.assertEquals(true, isOnlyO);
	}
}
