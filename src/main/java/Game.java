import java.util.Scanner;

public class Game {

    public static final char COMPUTER = 'x';
    public static final char PLAYER = 'o';

    private String inputPattern = "[1-9]\\,[1-9]";

    public Game() {
        start();
    }

    private void start() {
        Board board = new Board();
        Menu.mainMenu(board);
        while (finish()) {
            play();
        }
    }

    public Board userMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        String moveRead = scanner.nextLine();
        while (moveRead.matches(inputPattern)) {
            int column = moveRead.charAt(0)-1;
            int row = moveRead.charAt(2)-1;
        }

        return board;
    }

    private static boolean finish() {
        return false;
    }

    private static void play() {

    }
}
