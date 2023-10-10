package lesson58.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Transformer1Test {

    String input = "aaa BBBB deF vbghR bbb";

    @Test
    public void test_transformNullLength(){
        String zero = "";
        assertEquals(zero, Transformer1.transformString1(zero, new WordsTransformerToUpperCase()));
    }

    @Test
    public void test_transformToLowerCase(){
        String exp = "aaa bbbb deF vbghR bbb";
        assertEquals(exp, Transformer1.transformString1(input, new WordsTransformerLowerCase()));
    }

    @Test
    public void test_transformToUpperCase(){
        String exp = "AAA BBBB DEF vbghR BBB";
        assertEquals(exp, Transformer1.transformString1(input, new WordsTransformerToUpperCase()));
    }

    @Test
    public void test_transformStras(){
        String exp = "aaa BBBB deF ***** bbb";
        assertEquals(exp, Transformer1.transformString1(input, new WordsTransformStars()));
    }

    @Test
    public void test_transformNoChanges(){
        String exp = "aaaaaa BBBBBBBBBB";
        assertEquals(exp, Transformer1.transformString1(exp, new WordsTransformStars()));
    }


}