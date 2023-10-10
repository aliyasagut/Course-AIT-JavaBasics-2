package lesson57.homework57;

import lesson56.our_interfaces.*;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        /*
        1. Конкатинировать числа а и б
        1 и 2 - 12
         */
        System.out.println("------- task 1 -----------");
        Concatable concatable = (a, b) -> Integer.toString(a) + b;
        String res = concatable.concat(1, 2);
        System.out.println(res);

        BiFunction<Integer, Integer, String> biFunction = (a, b) -> Integer.toString(a) + b;
        System.out.println(biFunction.apply(3, 4));

        /*
        2. Если длина строки ровна 3, то вернуть true, иначе false
         */
        System.out.println("------- task 2 -----------");
        Checkable checkable = str -> str.length() == 3;
        System.out.println(checkable.check("str"));
        System.out.println(checkable.check("str1"));

        Predicate<String> predicate = str -> str.length() == 3;
        System.out.println(predicate.test("asd"));
        System.out.println(predicate.test("asdf"));

        /*
        3. Если длина строки четная, то вернуть true, иначе false
         */
        System.out.println("------- task 3 -----------");
        Checkable checkable1 = str -> str.length() % 2 == 0;
        System.out.println(checkable1.check("str"));
        System.out.println(checkable1.check("str1"));

        Predicate<String> predicate1 = str -> str.length() % 2 == 0;
        System.out.println(predicate1.test("123"));
        System.out.println(predicate1.test("1234"));

        /*
        4. Вернуть строку в верхнем регистре
         */
        System.out.println("------- task 4 -----------");
        Transformable transformable = str -> str.toUpperCase();
        System.out.println(transformable.modify("string"));

        Function<String, String> function = str -> str.toUpperCase();
        System.out.println(function.apply("test"));

        /*
        5. Если длина строки ровна 4, то вернуть ****, иначе вернуть строку без изменений
         */
        System.out.println("------- task 5 -----------");
//        Transformable transformable1 = str -> {
//            if (str.length() == 4) return "****";
//            else return str;
//        };
        Transformable transformable1 = str -> str.length() == 4 ? str = "****" : str;
        System.out.println(transformable1.modify("1234"));
        System.out.println(transformable1.modify("12345"));

        function = str -> str.length() == 4 ? str = "****" : str;
        System.out.println(function.apply("asdf"));
        System.out.println(function.apply("asdfd"));

        /*
        6. Распечатать строку в таком виде !строка!
         */
        System.out.println("------- task 6 -----------");
        Printable printable = str -> System.out.println("!" + str + "!");
        printable.print("hello");

        Consumer<String> consumer = str -> System.out.println("!" + str + "!");
        consumer.accept("test");

        /*
        7. возвращает "Hello world!"
         */
        System.out.println("------- task 7 -----------");
        Producable producable = () -> "Hello World!";
        System.out.println(producable.produce());

        Supplier<String> supplier =() -> "Hello World!";
        System.out.println(supplier.get());


    }
}
