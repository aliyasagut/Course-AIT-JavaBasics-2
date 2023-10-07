package lesson56.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lesson35.lambda_expressions.AnotherExample.x;

public class Main {
    // Lambda expressions
    /*
    Лямбда выражения используются для реализации метода функционального интерфейса.
    Функциональным является интерфейс, имеющий один абстрактный метод

    ( arguments list ) -> { body }
    () -> { body }
    (parameter) -> {body}
    (parameter1, parameter2) -> {body}
     */

    public static void main(String[] args) {
        int height = 1000;

        // before java 8, without lambda
        // реализация с помощью анонимного класса

        Flyable f = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying at " + height);
            }
        };

        f.fly();

        // реазизация с помощью ламбда выражение

        Flyable fLambda = () -> {
            System.out.println("We are flying at " + height);
        };
        fLambda.fly();


        Walkable wLambda = () -> {
            return "I can walk";
        };
        System.out.println(wLambda.walk());


        Eatable eLambda = (food) -> {
            return "I can eat " + food;
        };
        System.out.println(eLambda.eat("apple"));


        Summable sLambda = (x, y) -> {
            return x + y;
        };
        System.out.println(sLambda.sum(2, 5));

        // короткая форма записи лямбды

        Summable s = (x, y) -> x + y;
        System.out.println(s.sum(2, 3));

        Summable sMinus = (a, b) -> a - b;
        System.out.println("for sMinus: " + sMinus.sum(2, 3));

        Eatable e = food -> "A man can eat " + food;
        System.out.println(e.eat("cheese"));

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("peach");

        fruits.forEach(
                fruit -> System.out.println(fruit)
        );

        List<Product> items = new ArrayList<>();
        items.add(new Product("mouse", 25));
        items.add(new Product("laptop", 1000));
        items.add(new Product("keyboard", 75));

        Collections.sort(items, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println(items);

        Collections.sort(items, (p1, p2) -> p1.price - p2.price);
        System.out.println(items);


        Operationable<Integer> op1 = (a, b) -> a + b;
        System.out.println(op1.cals(1, 2));

        Operationable<String> op2 = (a, b) -> a + b;
        System.out.println(op2.cals("1", "2"));

        // lambda as a parameter

        /*
        Лямбда выражения можно передавать в качестве параметра в метод
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        IsMoreThan isMoreThan = num -> num > 3;
        System.out.println(isMoreThan.isMore(2));
        System.out.println(isMoreThan.isMore(5));

//        isMoreThan = num -> num > 10;
//        System.out.println(isMoreThan.isMore(9));
//        System.out.println(isMoreThan.isMore(50));

        System.out.println(sumIfCondition(numbers, isMoreThan));

        isMoreThan = num -> num>6;
        System.out.println(sumIfCondition(numbers, isMoreThan));



    }// end main

    public static int sumIfCondition(int[] ints, IsMoreThan expression) {
        int sum = 0;

        for (int elt : ints) {
            if (expression.isMore(elt)) {
                sum += elt;
            }
        }
        return sum;
    }
}
