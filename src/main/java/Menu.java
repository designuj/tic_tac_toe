import java.util.Scanner;

public class Menu {
    public static void mainMenu(Board board) {
        try {
            text("Hello geeky!");
            Thread.sleep(1000);
            text("It's time to play against Mr. Computer.");
            Thread.sleep(1000);
            text("Take a look at the Board.");
            Thread.sleep(1000);
            text(board.drawBoard());
            text("Hope you know the game :)");
            Thread.sleep(1000);
            text("Make a move in \'column,row\' style.");
            Thread.sleep(1000);
            text("Example input: \'1,9\' (counting from 1 to 9!).");
            Thread.sleep(1000);
            text("Make first move:");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveMenu(boolean yourMove, Game game) {
        if (yourMove) {
            try {
                Thread.sleep(2000);
                text("What's your move?");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                Thread.sleep(1000);
                text("Computer is making a move...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String drawBoard(Game game) {
        String board = "";
        return "";
    }

    private static void text(String text) {
        System.out.println(text);
    }
}
