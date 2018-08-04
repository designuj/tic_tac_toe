public class Game {
    private Menu menu;
    private Board board;
    private boolean endGame;
    private boolean playerMove;
    private String winner;

    private boolean isEndGame() {
        return endGame;
    }

    private boolean isPlayerMove() {
        return playerMove;
    }

    private Menu getMenu() {
        return menu;
    }

    private Board getBoard() {
        return board;
    }

    private String getWinner() {
        return winner;
    }

    public Game() {
        menu = new Menu();
        board = new Board();
        playerMove = true;
        endGame = false;

        while (!isEndGame()) {
            play(getMenu(), getBoard(), isPlayerMove(), isEndGame());
        }
    }

    private String play(Menu menu, Board board, boolean playerMove, boolean endGame) {
        if (!endGame) {
            if (playerMove) {
                makePlayerMove();
            } else {
                makeComputerMove();
            }
        } else {
            return "And the winner is...";
        }
        return "";
    }

    private void makeComputerMove() {
    }

    private void makePlayerMove() {

    }
}
