package pl.designuj.play.tictactoe.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import static pl.designuj.play.tictactoe.configuration.GameConfiguration.*;

@Service
@AllArgsConstructor
@Getter
@Setter
public class BoardService implements BoardAPI {
    private Character currentPlayer = FIRST_PLAYER;
    private Integer currentBoard = FIRST_BOARD;

    @Override
    public void switchUser(Character player) {
        currentPlayer = player;
    }

    @Override
    public void switchBoard(Integer location) {
        currentBoard = location;
    }
}
