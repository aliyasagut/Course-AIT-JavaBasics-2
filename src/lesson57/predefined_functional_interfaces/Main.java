package lesson57.predefined_functional_interfaces;

import java.util.function.*;

public class Main {
    // Встроеные функциональные интерфейсы
    // 1. Predicate (предиката) - проверяет соблюдение некоторого условия. Возвращет true либо false.
    /*
    методом предикаты является метод test()

    public interface Predicate<T>{
        boolean test(T t);
    }
     */

    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;

        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        // UnaryOperator<T> - принимает объект типа Т, что-то с ним делает и возвращает объект типа Т
        /* public interface UnaryOperator<T>{
            T apply (T Obj)
        }
         */

        UnaryOperator<Integer> unaryOperator = num -> num / 2;
        System.out.println(unaryOperator.apply(4));

        /*
        Function<T, R> - преобразует объект типа Т в объект типа R
        public interface Function<T,R>{
            R apply(T obj)
        }
         */

        Function<Integer, String> function = String::valueOf;
        System.out.println(function.apply(10));

        Function<Integer, String> function1 = num -> num + " times";
        System.out.println(function1.apply(10));

        /*
        BinaryOperator<T> - принимает два параметра типа Т, выполняет с ними операции и возвращает результат тоже типа Т
        BinaryOperator<T>{
        T apply(T obj1, T obj2)
        }
         */

        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(3, 4));

        /*
        Consumer<T> - что-то делает с объектом типа Т и ничего не возвращает
        Consumer<T>{
        accept(T obj)
        }
         */

        Consumer<String> consumer = System.out::println;
        consumer.accept("hello");

        /*
        Supplier<T> - ничего не принимает, а возвращает объект типа Т
        T get()
         */

        Supplier<String> supplier = () -> "Hello world";
        System.out.println(supplier.get());

        /*
        BiFunction<T,U,R> - принимает параметры типа T,U, возвращает объект типа R
        R apply(T, U), но T,U,R могут быть и одинаковыми
         */

        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;


        //Дефолтные методы предикаты (методы, которые имеют тело)
        // and - определяет вторую предикату, которую можно использовать как доп условие
        System.out.println("-------------Predicate And------------");
        Predicate<Integer> age18 = num -> num > 18;
        Predicate<Integer> age80 = num -> num < 80;
        System.out.println(age18.and(age80).test(12));
        System.out.println(age18.and(age80).test(19));
        System.out.println(age18.and(age80).test(40));

        // or
        System.out.println("----------Predicate or------------");
        Predicate<String> containsJava = str -> str.contains("java");
        Predicate<String> containsHello = str -> str.contains("hello");
        System.out.println(containsJava.or(containsHello).test("hello java"));
        System.out.println(containsJava.or(containsHello).test("java"));
        System.out.println(containsJava.or(containsHello).test("hello world"));
        System.out.println(containsJava.or(containsHello).test("world"));

        // negate
        System.out.println("-----------Predicate negate ----------");
        Predicate<Integer> age1 = num -> num>18;
        System.out.println(age1.negate().test(19));


    }
}
