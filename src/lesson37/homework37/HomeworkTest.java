package lesson37.homework37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private Homework homework;

    @BeforeEach
    public void setUp(){
        homework = new Homework();
    }

    @Test
    public void testMinFirst(){
        List<String> listStr = Arrays.asList("ten", "two three", "a", "twenty one", "four and five", "five");

        String expected = "a";
        assertEquals(expected, homework.returnTheFirstLongestOrShortest(listStr));
    }

    @Test
    public void testMaxFirst(){
        List<String> listStr = Arrays.asList("ten", "two three", "twenty one", "four and five", "a", "five");

        String expected = "four and five";
        assertEquals(expected, homework.returnTheFirstLongestOrShortest(listStr));
    }
}