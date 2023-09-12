package lesson40.homework40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Homework40Test {

    private Homework40 homework;

    @BeforeEach
    public void setUp(){
        homework = new Homework40();
    }

    @Test
    public void removeDuplicates_OneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(expected, homework.removeDuplicates(actual));
    }

    @Test
    public void removeDuplicates_NoDuplicates(){
        List<String> actual = Arrays.asList("John", "Mary", "Ann", "Bill");
        List<String> expected = Arrays.asList("John", "Mary", "Ann", "Bill");

        assertEquals(expected, homework.removeDuplicates(actual));

    }

    @Test
    public void removeDuplicates_SevereDuplicates(){
        List<String> actual = Arrays.asList("John", "Mary", "Ann", "Bill", "Mary", "Ann");
        List<String> expected = Arrays.asList("John", "Mary", "Ann", "Bill");

        assertEquals(expected, homework.removeDuplicates(actual));
    }

    @Test
    public void getDuplicates_OneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList();

        assertEquals(expected, homework.getDuplicates(actual));
    }

    @Test
    public void getDuplicates_SeveralElement_withoutDuplicates(){
        List<String> actual = Arrays.asList("John", "Ann", "Bill");
        List<String> expected = Arrays.asList();

        assertEquals(expected, homework.getDuplicates(actual));
    }

    @Test
    public void getDuplicates_SeveralElement_withDuplicates(){
        List<String> actual = Arrays.asList("John", "Ann", "Bill", "Ann", "Bill");
        List<String> expected = Arrays.asList("Ann", "Bill");

        assertEquals(expected, homework.getDuplicates(actual));
    }

    @Test
    public void getDuplicates_SeveralElement_withManyDuplicates(){
        List<String> actual = Arrays.asList("John", "Ann", "Bill", "Ann", "Bill", "Bill", "Bill", "Bill", "Bill");
        List<String> expected = Arrays.asList("Ann", "Bill");

        assertEquals(expected, homework.getDuplicates(actual));
    }


}