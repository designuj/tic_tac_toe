import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        char player = 'x';

        System.out.println("Welcome to my extented tic-tac-toe game.");
        System.out.println("Boards input looks like this:\n");
        System.out.println("  1 | 2 | 3\n ---|---|---\n  4 | 5 | 6\n ---|---|---\n  7 | 8 | 9\n");
        System.out.println("And this is how main board looks like:\n");

        while (!game.finish()) {


            System.out.println(game);
            System.out.println("Player '" + player + "' move (one-digit-style input):");

            int input = scanner.nextInt();
            game.move(player, input-1);

            if (player == 'x') {
                player = 'o';
            } else {
                player = 'x';
            }
            System.out.println("Current board is " + (game.getCurrent()+1));
        }

        System.out.println(game);

        if (game.getWinner() == '!') {
            System.out.println("Draw!");
        } else {
            System.out.println("Player '" + game.getWinner() + "' wins!");
        }
        scanner.close();
    }
}
