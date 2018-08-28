package pl.designuj.play.tictactoe.configuration;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GameConfiguration {
    public static final Integer PRESET_COUNTING = 1;
    public static final Integer BOARD_FIRST_INDEX = 0;
    public static final Integer BOARD_LAST_INDEX = 8;
    public static final Integer FIRST_BOARD = 4;
    public static final Character FIRST_PLAYER = 'o';
    public static final Character SECOND_PLAYER = 'x';
    public static final Character EMPTY_LOCATION = ' ';

    private static Integer[] win0 = {2, 4, 6};
    private static Integer[] win1 = {0, 1, 2};
    private static Integer[] win2 = {3, 4, 5};
    private static Integer[] win3 = {6, 7, 8};
    private static Integer[] win4 = {0, 3, 6};
    private static Integer[] win5 = {1, 4, 7};
    private static Integer[] win6 = {2, 5, 8};
    private static Integer[] win7 = {0, 4, 8};
    public static final List<Integer[]> WIN_SCHEMA = Arrays.asList(win0, win1, win2, win3, win4, win5, win6, win7);

    public static final Integer ITERATOR_1 = 0;
    public static final Integer ITERATOR_2 = 1;
    public static final Integer ITERATOR_3 = 2;
}
