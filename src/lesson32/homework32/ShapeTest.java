package lesson32.homework32;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    /*
    Test cases:
    1. если пустой массив
    2. массив из одной фигуры
    3. массив из нескольких фигур
     */
    private Rectangle rectangle = new Rectangle(5, 10);
    private Rectangle rectangle2 = new Rectangle(5, 4);
    private Circle circle = new Circle(10);
    private Circle circle2 = new Circle(20);


//    @BeforeAll
//    public static void setUp() {
//        Rectangle rectangle = new Rectangle(10, 20);
//        Rectangle rectangle2 = new Rectangle(50, 40);
//        Circle circle = new Circle(10);
//        Circle circle2 = new Circle(20);
//    }

    @Test
    public void givenEmptyArray_whenFindTotalArea_thenReturnTotalArea() {
        Shape[] shapes = {};
        assertEquals(0, Shape.totalSquare(shapes));
    }

    @Test
    public void givenArrayOf1_whenFindTotalArea_themReturnTotalArea(){
        Shape[] shapes = {rectangle};
        assertEquals(50, Shape.totalSquare(shapes));
    }

    @Test
    public void givenArrayOf2_whenFindTotalArea_themReturnTotalArea(){
        Shape[] shapes = {rectangle, circle};
        assertEquals(364, Shape.totalSquare(shapes));
    }

    @Test
    public void givenArrayOfMany_whenFindTotalArea_themReturnTotalArea(){
        Shape[] shapes = {rectangle, rectangle2, circle};
        assertEquals(384, Shape.totalSquare(shapes));
    }

}