package lesson57.method_reference;

public class Main {
    /*
    Method References (ссылки на метод)
    ссылка на метод - это способ сослаться на метод не выполняя его.
    Ссылки на методы связаны с лямбда-выражениями и им также требуется совместимый функциональный интерфейс

    Вариант 1.
    Ссылки на статические методы (Method references to static methods)
    ClassName :: methodName
     */

    public static void main(String[] args) {

        boolean res = numTest(OurPredicateClass::isNegative, -1);
        if (res)
            System.out.println("-1 is negative");

        res = numTest(OurPredicateClass::isEven, 4);
        if (res)
            System.out.println("4 is even");

        res = numTest(OurPredicateClass::isPositive, 1);
        if (res)
            System.out.println("1 is positieve");

        // пример 2 - instance method reference
        System.out.println("------ instance method reference -------");

        OurIntegerNumber ourIntegerNumber = new OurIntegerNumber(9);
        OurIntegerNumber ourIntegerNumber1 = new OurIntegerNumber(10);

        IntPredicate intPredicate = ourIntegerNumber::isFactor;
        res = intPredicate.test(3);
        System.out.println(res);

        intPredicate = ourIntegerNumber1::isFactor;
        res = intPredicate.test(3);
        System.out.println(res);

//        Вариант 3 - ClassName :: instanceMethodName
        System.out.println("------ Variant 3 ------------");
//        intPredicate = OurIntegerNumber :: isFactor; //так не получится, пототму что метод не статический

        IntPredicate2 intPredicate2 = OurIntegerNumber::isFactor;
        System.out.println(intPredicate2.test(ourIntegerNumber, 3));
        System.out.println(intPredicate2.test(ourIntegerNumber1, 3));

        // Generic example
        System.out.println("--------- generic example----------");
        SomeGenericInterface<Integer> someRef = SomeGenericClass::<Integer>genMethod;

        // constructor example
        System.out.println("----------- constructor example ----------");
        OurInterfaceForConstructor ourInterfaceForConstructor = OurClassForConstructor::new;
        OurClassForConstructor objectClass = ourInterfaceForConstructor.method("Java");
        System.out.println("String in the new object is "+ objectClass.str);


    }// end main

    public static boolean numTest(IntPredicate p, int n) {
        return p.test(n);
    }

    // Вариант 2.
    // ссылки на методы - Method references to instance methods
    /*
    objectRef :: methodName

    Вариант 3.
    Создание ссылки на любой объект класса через ссылку на обычный метод.

    ClassName :: instanceMethodName

    Вариант 4.
    Ссылки на конструкторы - Constructor references

    className :: new
    -  этом случае для создания ссылки на контруктор можно использовать функцональный интерфейс,
    метод которого совместим с конструктором
     */
}







