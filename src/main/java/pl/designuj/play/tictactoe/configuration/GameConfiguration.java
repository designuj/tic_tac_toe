package pl.designuj.play.tictactoe.configuration;

public class GameConfiguration {
    public static final Integer PRESET_COUNTING = 1;
    public static final Integer BOARD_FIRST_INDEX = 0;
    public static final Integer BOARD_LAST_INDEX = 8;
    public static final Integer FIRST_BOARD = 4;
    public static final Character FIRST_PLAYER = 'o';
    public static final Character SECOND_PLAYER = 'x';
    public static final Character EMPTY_LOCATION = ' ';
    public static final Integer[][] WIN_SCHEMA = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
    };
}
