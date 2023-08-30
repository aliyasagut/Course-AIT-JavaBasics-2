package lesson32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {
    /*
    Test cases:
    1. в массиве нет элементов
    2. в массиве один элемент
    3. в массиве два элемента
    4. в массиве из нескольких элементов максимальный находится в середине
    5. в массиве из нескольких элементов максимальный находится первый
    6. в массиве из нескольких элементов максимальный находится последний

     */

    private MaxNumber m = new MaxNumber();

    @Test
    public void zeroElement_Test() {
        int[] actual = {};
        assertEquals(-1, m.findMax(actual));
    }

    @Test
    public void oneElement_Test() {
        int[] actual = {5};
        assertEquals(actual[0], m.findMax(actual));
    }

    @Test
    public void twoElement_Test() {
        int[] actual = {5, 7};
        assertEquals(7, m.findMax(actual));
    }

    @Test
    public void severalElement_middle_Test() {
        int[] actual = {5, 7, 2, 1, 10, 4, 8, 3, 9};
        assertEquals(10, m.findMax(actual));
    }

    @Test
    public void severalElement_first_Test() {
        int[] actual = {11, 5, 7, 2, 1, 10, 4, 8, 3, 9};
        assertEquals(11, m.findMax(actual));
    }

    @Test
    public void severalElement_last_Test() {
        int[] actual = {5, 7, 2, 1, 10, 4, 8, 3, 9, 16};
        assertEquals(16, m.findMax(actual));
    }

}