import java.util.Arrays;

public class SubBoard {
    private char[][] subBoards = new char[3][3];

    public SubBoard() {
        for (char[] subRow:subBoards) {
            Arrays.fill(subRow, ' ');
        }
    }

    public SubBoard(char player) {
        for (char[] subRow:subBoards) {
            Arrays.fill(subRow, player);
        }
    }
}
