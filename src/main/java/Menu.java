import java.util.Scanner;

public class Menu {
    private MoveMain moveMain;
    private MoveSave moveSave;
    private String inputRegex;
    private boolean correctMove;

    public Menu() {
        inputRegex = "[1-3]\\,[1-3]";
        moveSave = new MoveSave(1, 1, 'o');
        correctMove = false;
    }

    private MoveMain makeMove() {

        while (!correctMove) {
            System.out.println("Type your move ('column,row' style):");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.matches(inputRegex)) {
                moveMain = new MoveMain(input.charAt(0), input.charAt(2), moveSave.getMainColumn(), moveSave.getMainRow(), 'o');
                moveSave = new MoveSave(input.charAt(0), input.charAt(2), 'x');
                correctMove = true;
            } else {
                System.out.println("Wrong coordinates.");
            }
            scanner.close();
        }
        return moveMain;
    }
}
