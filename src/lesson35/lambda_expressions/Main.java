package lesson35.lambda_expressions;

public class Main {
    /*
    Lambda expressions and Functional Interfaces

    Лямбда выражения - эфо форма анонимного класса, анонимный метод без названия.
    Лямбда выражения связаны с функциональными интерфейсами

    Функц. интерфейс - это интерфейс с одним абстрактным методом.

    Синтаксис:
        пааметры -> тело лямбда выражения
        parameters -> lambda body
     */

    public static void main(String[] args) {
//        без параметров:
//        () -> 100.0;

//        () -> Math.random() * 1000;
//        с параметрами:
//        (n) -> 2.0/n;
//        (n) -> (n % 2)==0; возващет булеан
//        n -> 1/n;

//      double getValue();
        OurValue ourValue;
        ourValue = () -> 100.0;


    }

    public double return100(){
        return 100.0;
    }
}
