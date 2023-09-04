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
//        ourValue = () -> "str";
        System.out.println("value is " + ourValue.getValue());

        OurParamValue ourParamValue = n -> 2.0 / n;
        System.out.println("value with param is " + ourParamValue.getValue(4.0));
//        ourParamValue = () -> 100.0;


        OurTestInterface isDevided = (a, b) -> (a % b) == 0;
        System.out.println("A is devided by b without remainder? " + isDevided.test(10, 2));

        OurTestInterface isMore = (a, b) -> a > b;
        System.out.println("Is A more than B? " + isMore.test(10, 2));

        OurTestInterface isEqual = (a, b) -> a == b;
        System.out.println("A = B ? " + isEqual.test(10, 2));

        StringTestInterface isPart = (str1, str2) -> str1.indexOf(str2) != -1;
        String str1 = "This is a test";
        System.out.println("Is string2 a prt of string1 ? " + isPart.test(str1, "is"));

        StringTestInterface isEqualStr = (a, b) -> a.equals(b);
        System.out.println(isEqualStr.test("qwerty", "qwertz"));


        NumericInterface smallDevidor = n -> {

            int res = 1;
            n = n < 0 ? -n : n;

            for (int i = 2; i <= n; i++) {
                if ((n % i) == 0){
                    res = i;
                    break;
                }
            }
            return res;
        };


    }

    public double return100() {
        return 100.0;
    }
}
