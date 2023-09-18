package lesson45.homework45;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Homework45Test {

    Homework45 homework;

    @BeforeEach
    public void setUp() {
        homework = new Homework45();
    }

    @Test
    public void test_oneItem() {
        List<Integer> ints = List.of(5);

        assertEquals(5, homework.findNumberWithoutPairMerge(ints));
    }

    @Test
    public void test_threeItems() {
        List<Integer> ints = List.of(5, 5, 5);

        assertEquals(5, homework.findNumberWithoutPairMerge(ints));
    }

    @Test
    public void test_fiveItems() {
        List<Integer> ints = List.of(5, 5, 9, 6, 6);

        assertEquals(9, homework.findNumberWithoutPairMerge(ints));
    }

    @Test
    public void test_manyItems() {
        List<Integer> ints = List.of(1, 8, 8, 8, 8, 8, 1, 2, 2);

        assertEquals(8, homework.findNumberWithoutPairMerge(ints));
    }

}