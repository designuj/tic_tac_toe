package pl.designuj.play.tictactoe.model;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

public class Board {

    private List<Character> charsInBoard = new ArrayList<>();
    private Character setToWin;

    public Board() {
        refresh(' ');
    }

    public void refresh(Character player) {
        for (int i = 0; i < 9; i++) {
            charsInBoard.add(player);
        }
    }

    public List<Character> getCharsInBoard() {
        return charsInBoard;

    }


    public void setWholeBoard(Character player) {
        for (int i = 0; i < charsInBoard.size(); i++) {
            charsInBoard.set(i, player);
        }
    }
}
