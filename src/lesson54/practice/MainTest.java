package lesson54.practice;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testSum (){

        assertEquals(15, Main.sumOfValuesFromFile("test.txt"));
    }
    @Test
    public void testLongest(){
        File fileName = new File("output.txt");
        assertEquals("asdfgddddd", Main.findTheLongestStringInFile(fileName));
    }

}