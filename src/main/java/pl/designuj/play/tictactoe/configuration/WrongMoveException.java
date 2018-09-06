package pl.designuj.play.tictactoe.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "It is not your turn, baby")
public class WrongMoveException extends RuntimeException {
}
