public class Board {
    private final static char PLAYER = 'o';
    private final static char COMPUTER = 'x';

    private char[][] charBoard = new char[9][9];

    public Board() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                charBoard[i][j] = ' ';
            }
        }
    }

    public static String showBoard(Board board) {
        return  "             |             |\n" +
                "  o | o | x  |  x | o | x  |  o | x | x\n" +
                "  o | o | x  |  o | x | o  |  o | o | x\n" +
                "  o | o | x  |  o | x | x  |  x | x | o\n" +
                "             |             |\n" +
                "-----------------------------------------\n" +
                "             |             |\n" +
                "  o | o | x  |  x | o | x  |  o | x | x\n" +
                "  o | o | x  |  o | x | o  |  o | o | x\n" +
                "  o | o | x  |  o | x | x  |  x | x | o\n" +
                "             |             |\n" +
                " ----------------------------------------\n" +
                "             |             |\n" +
                "  o | o | x  |  x | o | x  |  o | x | x\n" +
                "  o | o | x  |  o | x | o  |  o | o | x\n" +
                "  o | o | x  |  o | x | x  |  x | x | o\n" +
                "             |             |";
    }
}
