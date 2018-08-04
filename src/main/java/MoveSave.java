public class MoveSave extends Move {
    private int mainColumn;
    private int mainRow;
    private char playerChar;

    public MoveSave(int mainColumn, int mainRow, char playerChar) {
        this.mainColumn = mainColumn;
        this.mainRow = mainRow;
        this.playerChar = playerChar;
    }

    public int getMainColumn() {
        return mainColumn;
    }

    public int getMainRow() {
        return mainRow;
    }

    public char getPlayerChar() {
        return playerChar;
    }
}
