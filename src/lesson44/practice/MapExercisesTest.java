package lesson44.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    MapExercises mapExercises;

    @BeforeEach
    public void setUp(){
        mapExercises = new MapExercises();
    }

    @Test
    public void nameToNumberTest_2(){
        List<String> input = Arrays.asList("John", "Mary", "Peter", "John");

        assertEquals(2, mapExercises.nameToNumberOccurrence(input, "John"));
    }

    @Test
    public void nameToNumberTest_1(){
        List<String> input = Arrays.asList("John", "Mary", "Peter", "John");

        assertEquals(1, mapExercises.nameToNumberOccurrence(input, "Peter"));
    }

    @Test
    public void nameToNumberTest_0(){
        List<String> input = Arrays.asList("John", "Mary", "Peter", "John");

        assertEquals(0, mapExercises.nameToNumberOccurrence(input, "Bill"));
    }

    @Test
    public void nameToNumberTest_onlyTwoJohns(){
        List<String> input = Arrays.asList("John", "John");

        assertEquals(2, mapExercises.nameToNumberOccurrence(input, "John"));
    }

}