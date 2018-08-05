public class Board {
    public void move(char player, int input) {

    }

    public boolean finishGame(char[][] board) {
        boolean gameOver = true;
        for (char[] inside:board) {
            for (char deepInside:inside) {
                if (deepInside == ' ') {
                    gameOver = false;
                    break;
                }
            }
        }
        if (gameOver) {
            return true;
        } else {
            return getWinner() != '·';
        }
    }

    public char getWinner(char[][] board) {
        int[][] wins = {
                            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, //rows
                            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, //columns
                            {0, 4, 8}, {2, 4, 6}             // diagonals
        };

        for (int[] field:wins) {
            if (isWin(field[0], field[1], field[2])) {
                return board[field[0]/3][field[0]%3];
            }
        }
        return '·';
    }

    private boolean isWin(int fieldOne, int fieldTwo, int fieldThree) {
        return
    }
}
