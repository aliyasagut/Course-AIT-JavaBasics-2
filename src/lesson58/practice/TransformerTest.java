package lesson58.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {

    Transformer transformer;
    String input;
    Predicate<String> predicate;
    Function<String, String> function;

    @BeforeEach
    public void setUp(){
        transformer = new Transformer();
        input = "aaa BBBB deF vbghR bbb";
    }

    @Test
    public void test_empty(){
        input = "";
        predicate = s -> s.length() == 3;
        function = String::toUpperCase;

        assertEquals("", transformer.transformString(input, predicate, function));
    }

    @Test
    public void test_3toUpperCase(){
        predicate = s -> s.length() == 3;
        function = String::toUpperCase;

        assertEquals("AAA BBBB DEF vbghR BBB", transformer.transformString(input, predicate, function));
    }

    @Test
    public void test_4toLowerCase(){
        predicate = s -> s.length() == 4;
        function = String::toLowerCase;

        assertEquals("aaa bbbb deF vbghR bbb", transformer.transformString(input, predicate, function));
    }

    @Test
    public void test_5stars(){
        predicate = s -> s.length() == 5;
        function = s -> "*****";

        assertEquals("aaa BBBB deF ***** bbb", transformer.transformString(input, predicate, function));
    }

    @Test
    public void test_noChanges(){
        input = "aaa bbbbbbb";
        predicate = s -> s.length() == 4;
        function = String::toLowerCase;

        assertEquals(input, transformer.transformString(input, predicate, function));
    }

}