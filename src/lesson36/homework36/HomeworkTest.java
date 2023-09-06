package lesson36.homework36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private Homework homework;

    @BeforeEach
    public void setUp() {
        homework = new Homework();
    }

    @Test
    public void yesOrNoTestEmpty() {
        assertEquals(Arrays.asList(), homework.yesOrNo(Arrays.asList(), Arrays.asList()));
    }

    @Test
    public void yesOrNoTestOneElement() {

        List<String> expected = Arrays.asList("No");
        List<Integer> actual1 = Arrays.asList(1);
        List<Integer> actual2 = Arrays.asList(2);

        assertEquals(expected, homework.yesOrNo(actual1, actual2));
    }

    @Test
    public void yesOrNoTestSeveralElement() {

        List<String> expected = Arrays.asList("No", "Yes", "No", "Yes");
        List<Integer> actual1 = Arrays.asList(1, 3, 6, 9);
        List<Integer> actual2 = Arrays.asList(2, 3, 7, 9);

        assertEquals(expected, homework.yesOrNo(actual1, actual2));
    }

    @Test
    public void withoutElementsEmpty(){
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList();

        assertEquals(expected, homework.withoutEltsMoreThanNWithIterator(actual, 5));
    }
    @Test
    public void withoutElementsOneElement(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, homework.withoutEltsMoreThanNWithIterator(actual, 5));
    }
    @Test
    public void withoutElementsNoSuchElts(){
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(8);
        expected.add(7);
        assertEquals(expected, homework.withoutEltsMoreThanNWithIterator(actual, 0));
    }
    @Test
    public void withoutElementsSeveralElements(){
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(8);
        expected.add(7);
        List<Integer> actual = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(8);
        expected.add(7);
        expected.add(77);
        assertEquals(expected, homework.withoutEltsMoreThanNWithIterator(actual, 70));
    }

}