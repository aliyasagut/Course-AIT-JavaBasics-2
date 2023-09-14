package lesson43.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    private MapExercises mapExercises;

    @BeforeEach
    public void setUp() {
        mapExercises = new MapExercises();
    }

    @Test
    public void test_AandBareExist() {
        Map<String, String> actual = new LinkedHashMap<>();
        actual.put("a", "hi");
        actual.put("b", "there");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "hi");
        expected.put("b", "there");
        expected.put("ab", "hithere");

        assertEquals(expected, mapExercises.createNewABMap(actual));
    }

    @Test
    public void test_noA() {
        Map<String, String> actual = new LinkedHashMap<>();
        actual.put("c", "hi");
        actual.put("b", "there");

        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("c", "hi");
        expected.put("b", "there");

        assertEquals(expected, mapExercises.createNewABMap(actual));
    }

    @Test
    public void test_noB() {
        Map<String, String> actual = new LinkedHashMap<>();
        actual.put("a", "hi");
        actual.put("c", "there");

        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("a", "hi");
        expected.put("c", "there");

        assertEquals(expected, mapExercises.createNewABMap(actual));
    }

    @Test
    public void test_empty() {
        Map<String, String> actual = new LinkedHashMap<>();


        Map<String, String> expected = new LinkedHashMap<>();


        assertEquals(expected, mapExercises.createNewABMap(actual));
    }

}