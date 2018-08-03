public class SmallBoard {
    private char[][] smallBoard;


    public SmallBoard() {
        smallBoard = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    private void fillSmallBoard(int smallColumn, int smallRow, char player) {
        smallBoard[smallColumn][smallRow] = player;
    }

    public String getRow(int insideRow) {
        return String.valueOf(smallBoard[insideRow][0]) + String.valueOf(smallBoard[insideRow][1]) + String.valueOf(smallBoard[insideRow][2]);
    }
}
