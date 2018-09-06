package pl.designuj.play.tictactoe.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Game is not available at the moment. Try to start a new game.")
public class GameNotAvailableException extends RuntimeException {
}
