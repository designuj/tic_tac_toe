import java.util.Scanner;

public class Game {
    private String inputPattern = "[1-9]\\,[1-9]";
    public static void start() {
        Menu.mainMenu();
        Board board = new Board();

    }

    public Board userMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        String moveRead = scanner.nextLine();
        while (moveRead.matches(inputPattern)) {
            int column = moveRead.charAt(0);
            int row = moveRead.charAt(2);
        }

        return board;
    }
}
