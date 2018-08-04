import java.util.Scanner;

public class Menu {
    private MoveMain moveMain;
    private MoveSave moveSave;
    private String inputRegex;
    private boolean correctMove;

    private String coordinatesToText(MoveSave moveSave) {
        if (moveSave.getMainColumn() < 3 && moveSave.getMainRow() < 3) {
            return "left-top";
        } else if (moveSave.getMainColumn() < 3 && moveSave.getMainRow() > 5) {
            return "left-bottom";
        } else if (moveSave.getMainColumn() < 3) {
            return "left-middle";
        } else if (moveSave.getMainColumn() < 3 && moveSave.getMainRow() > 5) {
            return "left-middle";
        }
    }

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
                moveMain = new MoveMain(input.charAt(0)-1, input.charAt(2)-1, moveSave.getMainColumn(), moveSave.getMainRow(), 'o');
                moveSave = new MoveSave(input.charAt(0)-1, input.charAt(2)-1, 'x');
                correctMove = true;
            } else {
                System.out.println("Wrong coordinates.");
            }
            scanner.close();
        }
        return moveMain;
    }

    public
}
