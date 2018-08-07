public class FullBoardException extends Exception {

    private int board;

    public FullBoardException(int board) {
        super("Board " + board + " is already full.");
    }

    public int getBoard() {
        return board;
    }
}
