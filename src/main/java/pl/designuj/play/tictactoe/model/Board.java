package pl.designuj.play.tictactoe.model;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import java.util.List;

@Component
public class Board {

    private List<Character> charsInBoard;
    private Boolean winBoard;
    private Character player;

    public Board(List<Character> charsInBoard, Boolean winBoard, Character player) {
        this.charsInBoard = charsInBoard;
        this.winBoard = winBoard;
        this.player = player;
    }

    public List<Character> getCharsInBoard() {
        return charsInBoard;
    }

    public void setCharsInBoard(List<Character> charsInBoard) {
        this.charsInBoard = charsInBoard;
    }

    public Boolean getWinBoard() {
        return winBoard;
    }

    public void setWinBoard(Boolean winBoard) {
        this.winBoard = winBoard;
    }

    public Character getPlayer() {
        return player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }
}
