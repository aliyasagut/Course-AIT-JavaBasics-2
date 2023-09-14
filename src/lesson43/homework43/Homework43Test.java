package lesson43.homework43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Homework43Test {
    /*
    Test cases:
    1. empty string
    2. string without duplicates
    3. String with duplicates
    4. String with one elt and many duplicates
     */

    Homework43 homework;

    @BeforeEach
    public void setUp(){
       homework = new Homework43();
    }

    @Test
    public void test_stringIsEmpty(){
        String[] strings = {};
        Map<String, Boolean> expected = new LinkedHashMap<>();

        assertEquals(expected, homework.createStrBooleanMap(strings));
    }

    @Test
    public void test_stringIsNotEmpty_withoutDuplicates(){
        String[] strings = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        Map<String, Boolean> expected = new LinkedHashMap<>();
        expected.put("monday", false);
        expected.put("tuesday", false);
        expected.put("wednesday", false);
        expected.put("thursday", false);
        expected.put("friday", false);

        assertEquals(expected, homework.createStrBooleanMap(strings));
    }

    @Test
    public void test_stringIsNotEmpty_withDuplicates(){
        String[] strings = {"monday", "tuesday", "wednesday", "thursday", "friday", "monday", "tuesday"};
        Map<String, Boolean> expected = new LinkedHashMap<>();
        expected.put("monday", true);
        expected.put("tuesday", true);
        expected.put("wednesday", false);
        expected.put("thursday", false);
        expected.put("friday", false);

        assertEquals(expected, homework.createStrBooleanMap(strings));
    }

    @Test
    public void test_stringIsNotEmpty_oneEltWithDuplicates(){
        String[] strings = {"monday", "monday", "monday", "monday"};
        Map<String, Boolean> expected = new LinkedHashMap<>();
        expected.put("monday", true);

        assertEquals(expected, homework.createStrBooleanMap(strings));
    }

}