public class Board {
    private SmallBoard[][] smallBoards;
    public Board() {
        smallBoards = new SmallBoard[][]{{new SmallBoard(), new SmallBoard(), new SmallBoard()}, {new SmallBoard(), new SmallBoard(), new SmallBoard()}, {new SmallBoard(), new SmallBoard(), new SmallBoard()}};
    }

    private void fillBoard(int column, int row, char player) {
    }

    public String drawBoard() {
        return smallBoards[0][0].getRow(0) + "|" + smallBoards[1][0].getRow(0) + "|" + smallBoards[2][0].getRow(0) + "\n" +
                smallBoards[0][0].getRow(1) + "|" + smallBoards[1][0].getRow(1) + "|" + smallBoards[2][0].getRow(1) + "\n" +
                smallBoards[0][0].getRow(2) + "|" + smallBoards[1][0].getRow(2) + "|" + smallBoards[2][0].getRow(2) + "\n" +
                "-----------" + "\n" +
                smallBoards[0][1].getRow(0) + "|" + smallBoards[1][1].getRow(0) + "|" + smallBoards[2][1].getRow(0) + "\n" +
                smallBoards[0][1].getRow(1) + "|" + smallBoards[1][1].getRow(1) + "|" + smallBoards[2][1].getRow(1) + "\n" +
                smallBoards[0][1].getRow(2) + "|" + smallBoards[1][1].getRow(2) + "|" + smallBoards[2][1].getRow(2) + "\n" +
                "-----------" + "\n" +
                smallBoards[0][2].getRow(0) + "|" + smallBoards[1][2].getRow(0) + "|" + smallBoards[2][2].getRow(0) + "\n" +
                smallBoards[0][2].getRow(1) + "|" + smallBoards[1][2].getRow(1) + "|" + smallBoards[2][2].getRow(1) + "\n" +
                smallBoards[0][2].getRow(2) + "|" + smallBoards[1][2].getRow(2) + "|" + smallBoards[2][2].getRow(2);
    }
}
