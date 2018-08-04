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
                "  " + board.charBoard[0][0] + " | " + board.charBoard[1][0] + " | " + board.charBoard[2][0] + "  |  " + board.charBoard[3][0] + " | " + board.charBoard[4][0] + " | " + board.charBoard[5][0] + "  |  " + board.charBoard[6][0] + " | " + board.charBoard[7][0] + " | " + board.charBoard[8][0] + " \n" +
                "  " + board.charBoard[0][1] + " | " + board.charBoard[1][1] + " | " + board.charBoard[2][1] + "  |  " + board.charBoard[3][1] + " | " + board.charBoard[4][1] + " | " + board.charBoard[5][1] + "  |  " + board.charBoard[6][1] + " | " + board.charBoard[7][1] + " | " + board.charBoard[8][1] + " \n" +
                "  " + board.charBoard[0][2] + " | " + board.charBoard[1][2] + " | " + board.charBoard[2][2] + "  |  " + board.charBoard[3][2] + " | " + board.charBoard[4][2] + " | " + board.charBoard[5][2] + "  |  " + board.charBoard[6][2] + " | " + board.charBoard[7][2] + " | " + board.charBoard[8][2] + " \n" +
                "             |             |\n" +
                "-----------------------------------------\n" +
                "             |             |\n" +
                "  " + board.charBoard[0][3] + " | " + board.charBoard[1][3] + " | " + board.charBoard[2][3] + "  |  " + board.charBoard[3][3] + " | " + board.charBoard[4][3] + " | " + board.charBoard[5][3] + "  |  " + board.charBoard[6][3] + " | " + board.charBoard[7][3] + " | " + board.charBoard[8][3] + " \n" +
                "  " + board.charBoard[0][4] + " | " + board.charBoard[1][4] + " | " + board.charBoard[2][4] + "  |  " + board.charBoard[3][4] + " | " + board.charBoard[4][4] + " | " + board.charBoard[5][4] + "  |  " + board.charBoard[6][4] + " | " + board.charBoard[7][4] + " | " + board.charBoard[8][4] + " \n" +
                "  " + board.charBoard[0][5] + " | " + board.charBoard[1][5] + " | " + board.charBoard[2][5] + "  |  " + board.charBoard[3][5] + " | " + board.charBoard[4][5] + " | " + board.charBoard[5][5] + "  |  " + board.charBoard[6][5] + " | " + board.charBoard[7][5] + " | " + board.charBoard[8][5] + " \n" +
                "             |             |\n" +
                " ----------------------------------------\n" +
                "             |             |\n" +
                "  " + board.charBoard[0][6] + " | " + board.charBoard[1][6] + " | " + board.charBoard[2][6] + "  |  " + board.charBoard[3][6] + " | " + board.charBoard[4][6] + " | " + board.charBoard[5][6] + "  |  " + board.charBoard[6][6] + " | " + board.charBoard[7][6] + " | " + board.charBoard[8][6] + " \n" +
                "  " + board.charBoard[0][7] + " | " + board.charBoard[1][7] + " | " + board.charBoard[2][7] + "  |  " + board.charBoard[3][7] + " | " + board.charBoard[4][7] + " | " + board.charBoard[5][7] + "  |  " + board.charBoard[6][7] + " | " + board.charBoard[7][7] + " | " + board.charBoard[8][7] + " \n" +
                "  " + board.charBoard[0][8] + " | " + board.charBoard[1][8] + " | " + board.charBoard[2][8] + "  |  " + board.charBoard[3][8] + " | " + board.charBoard[4][8] + " | " + board.charBoard[5][8] + "  |  " + board.charBoard[6][8] + " | " + board.charBoard[7][8] + " | " + board.charBoard[8][8] + " \n" +
                "             |             |";
    }

    private void boardEdit(MoveMain moveMain) {
        int columnHelper;
        int rowHelper;

        if (moveMain.getMainColumn() < 3) {
            columnHelper = 0;
        } else if (moveMain.getMainColumn() > 5) {
            columnHelper = 2;
        } else {
            columnHelper = 1;
        }

        if (moveMain.getMainRow() < 3) {
            rowHelper = 0;
        } else if (moveMain.getMainRow() > 5) {
            rowHelper = 2;
        } else {
            rowHelper = 1;
        }

        charBoard[moveMain.getColumn()+columnHelper][moveMain.getRow()+rowHelper] = moveMain.getPlayerChar();
    }
}
