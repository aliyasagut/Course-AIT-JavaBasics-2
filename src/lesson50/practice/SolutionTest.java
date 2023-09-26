package lesson50.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000};
        int min = 5;
        int[] expected = {0, 1, 2, 3, 1, 1, 2, 3, 4};

        assertArrayEquals(expected, solution.countOrdersNumberMy(orderTimes, min));
        assertArrayEquals(expected, solution.countOrdersNumber(orderTimes, min));
    }

    @Test
    public void test2() {
        long[] orderTimes = {1_000_000, 1_100_000, 1_150_000, 1_200_000, 1_250_000, 1_300_000};
        int min = 5;
        int[] expected = {0, 1, 2, 3, 4, 5};

        assertArrayEquals(expected, solution.countOrdersNumberMy(orderTimes, min));
        assertArrayEquals(expected, solution.countOrdersNumber(orderTimes, min));
    }

    @Test
    public void test3() {
        long[] orderTimes = {1_000_000, 1_400_000, 1_800_000, 2_200_000};
        int min = 5;
        int[] expected = {0, 0, 0, 0};

        assertArrayEquals(expected, solution.countOrdersNumberMy(orderTimes, min));
        assertArrayEquals(expected, solution.countOrdersNumber(orderTimes, min));
    }


}