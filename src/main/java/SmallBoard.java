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

    public char checkForWin() {
        if (
                (String.valueOf(smallBoard[0][0]).equals("o") && String.valueOf(smallBoard[1][0]).equals("o") && String.valueOf(smallBoard[2][0]).equals("o")) ||
                (String.valueOf(smallBoard[0][1]).equals("o") && String.valueOf(smallBoard[1][1]).equals("o") && String.valueOf(smallBoard[2][1]).equals("o")) ||
                (String.valueOf(smallBoard[0][2]).equals("o") && String.valueOf(smallBoard[1][2]).equals("o") && String.valueOf(smallBoard[2][2]).equals("o")) ||

                (String.valueOf(smallBoard[0][0]).equals("o") && String.valueOf(smallBoard[0][1]).equals("o") && String.valueOf(smallBoard[0][2]).equals("o")) ||
                (String.valueOf(smallBoard[1][0]).equals("o") && String.valueOf(smallBoard[1][1]).equals("o") && String.valueOf(smallBoard[1][2]).equals("o")) ||
                (String.valueOf(smallBoard[2][0]).equals("o") && String.valueOf(smallBoard[2][1]).equals("o") && String.valueOf(smallBoard[2][2]).equals("o")) ||

                (String.valueOf(smallBoard[0][0]).equals("o") && String.valueOf(smallBoard[1][1]).equals("o") && String.valueOf(smallBoard[2][2]).equals("o")) ||
                (String.valueOf(smallBoard[0][2]).equals("o") && String.valueOf(smallBoard[1][1]).equals("o") && String.valueOf(smallBoard[2][0]).equals("o"))
        ) {
            return 'o';
        } else if (
                (String.valueOf(smallBoard[0][0]).equals("x") && String.valueOf(smallBoard[1][0]).equals("x") && String.valueOf(smallBoard[2][0]).equals("x")) ||
                (String.valueOf(smallBoard[0][1]).equals("x") && String.valueOf(smallBoard[1][1]).equals("x") && String.valueOf(smallBoard[2][1]).equals("x")) ||
                (String.valueOf(smallBoard[0][2]).equals("x") && String.valueOf(smallBoard[1][2]).equals("x") && String.valueOf(smallBoard[2][2]).equals("x")) ||

                (String.valueOf(smallBoard[0][0]).equals("x") && String.valueOf(smallBoard[0][1]).equals("x") && String.valueOf(smallBoard[0][2]).equals("x")) ||
                (String.valueOf(smallBoard[1][0]).equals("x") && String.valueOf(smallBoard[1][1]).equals("x") && String.valueOf(smallBoard[1][2]).equals("x")) ||
                (String.valueOf(smallBoard[2][0]).equals("x") && String.valueOf(smallBoard[2][1]).equals("x") && String.valueOf(smallBoard[2][2]).equals("x")) ||

                (String.valueOf(smallBoard[0][0]).equals("x") && String.valueOf(smallBoard[1][1]).equals("x") && String.valueOf(smallBoard[2][2]).equals("x")) ||
                (String.valueOf(smallBoard[0][2]).equals("x") && String.valueOf(smallBoard[1][1]).equals("x") && String.valueOf(smallBoard[2][0]).equals("x"))
        ) {
            return 'x';
        }
        else {
            return ' ';
        }
    }
}
