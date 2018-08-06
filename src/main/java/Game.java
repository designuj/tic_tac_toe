public class Game {
    private Board[][] boardArray = new Board[3][3];
    private Board board = new Board();
    private int current = 4;

    public Game() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardArray[i][j] = new Board();
            }
        }
    }

    public void move(char player, int location) {
        Board smallBoard = boardArray[current / 3][current % 3];
        smallBoard.move(player, location);

        if (smallBoard.finish()) {
            boardArray[current / 3][current % 3] = new Board(smallBoard.getWinner());
            board.move(smallBoard.getWinner(), current);
        }
        current = location;
    }

    public String toString() {
        int line = 0;
        String out = "";
        while (line < 9) {
            int j = 0;
            out +=
                    " " +
                    boardArray[line / 3][j++].getBoard()[line % 3] +
                    "  |  " +
                    boardArray[line / 3][j++].getBoard()[line % 3] +
                    "  |  " +
                    boardArray[line / 3][j++].getBoard()[line % 3] +
                    "\n";

            if (line == 2 || line == 5) {
                out +=          "            |             |\n" +
                                "------------|-------------|------------\n" +
                                "            |             |\n";
            }
            line++;
        }
        return "            |             |\n" + out + "            |             |\n";
    }

    public Board[][] getBoardArray() {
        return boardArray;
    }

    public char getWinner() {
        return board.getWinner();
    }

    public boolean finish() {
        return board.finish();
    }

    public int getCurrent() {
        return current;
    }
}