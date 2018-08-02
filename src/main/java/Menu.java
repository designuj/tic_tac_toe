import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        try {
            System.out.println("Hello geeky!");
            Thread.sleep(2000);
            System.out.println("It's time to play against Mr. Computer.");
            Thread.sleep(2000);
            System.out.println("Take a look at the Board.");
            Thread.sleep(2000);
            System.out.println("Hope you know the game :)");
            Thread.sleep(2000);
            System.out.println("Make a move in \'column,row\' or \'column, row\' style.");
            Thread.sleep(2000);
            System.out.println("Example input: \'1,2\' or \'1, 2\'.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveMenu(boolean yourMove, Game game) {
        if (yourMove) {
            try {
                Thread.sleep(2000);
                System.out.println("What's your move?");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                Thread.sleep(2000);
                System.out.println("Computer is making a move...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void drawBoard(Game)
}
