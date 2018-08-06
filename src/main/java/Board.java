import java.util.Arrays;

public class Board {
    private char[][] board = new char[3][3];

    public Board() {
        for (char[] inside:board) {
            Arrays.fill(inside,' ');
        }
    }

    public Board(char player) {
        for (char[] inside:board) {
            Arrays.fill(inside, player);
        }
    }

    public String[] getBoard() {
        String[] outBoard = new String[3];

        for (int i = 0; i < 9;) {
            char[] boardline = board[i / 3];
            outBoard[i / 3] = boardline[i++ % 3] + " | " + boardline[i++ % 3] + " | " + boardline[i++ % 3];
        }
        return outBoard;
    }

    public void move(char player,int location) {
        board[location / 3][location % 3] = player;
    }

    public String toString() {
        String out = "";
        for (String line : getBoard()) {
            out += line + "\n";
        }
        return out;
    }

    private boolean isWin(int positionOne, int positionTwo, int positionThree) {
        return board[positionOne / 3][positionOne % 3] == board[positionTwo / 3][positionTwo % 3] && board[positionTwo / 3][positionTwo % 3] == board[positionThree / 3][positionThree % 3] && board[positionOne / 3][positionOne % 3] != ' ' && board[positionOne / 3][positionOne % 3] != '!';
    }

    public char getWinner() {
        int[][] wins = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, //rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, //columns
                {0, 4, 8}, {2, 4, 6}             //diagonals
        };

        for (int[] locations : wins) {
            if (isWin(locations[0],locations[1],locations[2])) {
                return board[locations[0]/3][locations[0]%3];
            }
        }
        return '!';
    }

    public boolean finish() {
        boolean over = true;
        for (char[] inside : board) {
            for (char deepInside : inside){
                if (deepInside == ' ') {
                    over = false;
                    break;
                }
            }
        }
        if (over) {
            return true;
        } else {
            return getWinner() != '!';
        }
    }
}
