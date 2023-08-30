package lesson32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach  // этот метод будет выполняться перед каждым тестовым методом
    public void setUp() {
        calculator = new Calculator();
    }

    @Test  // это тестовый метод
    @DisplayName("Simple multiplication should be correct")  // можно использовать для определения имени метода
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5)); // выражение, которое и определяет равенство ожидаемого и фактического
    }

    @Test
    @DisplayName("Check correct handling of zero")
    void testMultiplyZero() {
        assertEquals(0, calculator.multiply(0,5));
        assertEquals(0, calculator.multiply(4,0));
    }

}