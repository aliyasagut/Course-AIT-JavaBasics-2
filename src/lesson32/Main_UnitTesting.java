package lesson32;

public class Main_UnitTesting {
    /*
    Юнит Тестирование JUnit 5

    Тестирование - это когда один программный код запускает другой с целью проверки его функционирования
    на соответствие ожидаемому результату.

    Виды тестирование:

    unit testing - тестирование отдельных методов

    integration (functional) testing - проверяется, работает ли вся система или какой-то ее компонент в соответствии с ожиданиями

    performance testing - нагрузочное тестирование - проверка эффективности работы системы при высокой нагрузке

    JUnit 5
    Платформа JUnit
    JUnit Jupiter
    JUnit Vintage

    Для тестирования методов какого-либо класса обычно создается отдельно тестовый класс,
    котрый принято называть по имени тестируемого класса прибавляя в конце слово Test
    Car -> CarTest

    Несколько аннотаций JUnit:
    @BeforeEach - метод будет запускаться перед каждым тестовым методом
    @DisplayName - может использоваться для определения имени теста
    @Test - становится тестовым методом
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5, 3));
        System.out.println(calculator.multiply(0, 5));

        System.out.println("------------------------");
        System.out.println(Circle.compareNumbers(5, 3));
        System.out.println(Circle.compareNumbers(3, 5));
    }
}
