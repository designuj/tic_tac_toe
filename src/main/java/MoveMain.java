public class MoveMain extends Move {
    private int mainColumn;
    private int mainRow;
    private char playerChar;

    private int column;
    private int row;

    public MoveMain(int column, int row, int mainColumn, int mainRow, char playerChar) {
        this.column = column;
        this.row = row;
        this.mainColumn = mainColumn;
        this.mainRow = mainRow;
        this.playerChar = playerChar;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public char getPlayerChar() {
        return playerChar;
    }

    public int getMainColumn() {
        return mainColumn;
    }

    public int getMainRow() {
        return mainRow;
    }
}
