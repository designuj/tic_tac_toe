import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        char player = 'x';

        while (!board.finishGame()) {
            System.out.println(board);
            System.out.println("Player '" + player + "' - make a move (input in one-digit-style):");

            board.move(player, scanner.nextInt()-1);
            if (player == 'x') {
                player = 'o';
            } else {
                player = 'o';
            }
        }

        System.out.println(board);
        if (board.getWinner() == '!') {
            System.out.println("It's draw!");
        } else {
            System.out.println(board.getWinner() + " wins!");
        }
    }
}
