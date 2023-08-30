package lesson31.wrapper_classes_and_generics;

import lesson31.wrapper_classes_and_generics.gen_interfaces.Person2;

public class Our_generics {

    /*
    Обобщения, Дженерики, Generic

    Дженерики позволяют не указывать конкретный тип, который будет использоваться.
    Поэтому мы можем указать, что класс является обобщенным с помощью универсального
    параметра в угловых скобках после имени класса <T>.
    Вместо этого параметра в последствии можно подставить любой тип.

    Дженерики не работают с примитивами.
     */
    public static void main(String[] args) {
        Person<Integer> john = new Person<>("John", 35);
        System.out.println(john.getName());
        System.out.println(john.getAge());


        Person<String> bill = new Person<>("Bill", "forty years");
        System.out.println(bill.getName());
        System.out.println(bill.getAge());

//        Person<Integer> peter = new Person<>("Peter", "twenty");

        // Обобщенные методы

        Printer printer = new Printer();

        Integer[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"a", "b", "c"};

        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        // обобщенные интерфейсы
        // несколько универсальныъ параметров

        System.out.println();
        Person2<Integer, String> ann = new Person2<>("Ann", 25);
        System.out.println(ann.getAge());
        System.out.println(ann.getName());

        // обобщенные конструкторы
        // в этом случае перед конструктором также указывают в угловых скобках универсальные параметры
    }

}
