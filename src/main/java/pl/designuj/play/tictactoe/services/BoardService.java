package pl.designuj.play.tictactoe.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
@Getter
@Setter
@NoArgsConstructor
public class BoardService {

    private Character currentPlayer = FIRST_PLAYER;
    private Integer currentBoard = FIRST_BOARD;

    public void switchUser(Character player) {
        currentPlayer = player;
    }

    public void switchBoard(Integer location) {
        currentBoard = location;
    }
}
