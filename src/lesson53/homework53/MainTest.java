package lesson53.homework53;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void testReadIntoString(){
        String expected = "Hello java and everyone!\n";

        assertEquals(expected, Main.readFile("test.txt"));
    }


}