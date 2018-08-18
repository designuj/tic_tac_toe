package pl.designuj.play.tictactoe.model;

public class Move {
    private Character player;
    private Integer location;

    public Move(Character player, Integer location) {
        this.player = player;
        this.location = location;
    }

    public Character getPlayer() {
        return player;
    }

    public Integer getLocation() {
        return location;
    }
}
