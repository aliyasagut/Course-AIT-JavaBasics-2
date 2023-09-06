package lesson36.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Collections

    List and ArrayList - список в основе своей имеющий массив и количество элементов в листе не фиксировано.
    Имееет гораздо больше методов и возможностей, чем использую обычный массив. В том числе имеет 3 конруктора.

    Конструкторы:

    ArrayList () - создает ппустой лист
    ArrayList (Collection collection) - создается лист, в который добавляются все элементы коллекции collection.
    ArraList (int capacity) - список с начальным размером равным capacity.
     */

    public static void main(String[] args) {

//        ArrayList<String> names = new ArrayList<>();
        List<String> names = new ArrayList<>();

//        Добавление элемента в конец листа, метод add() возвращает true, если удалось добавить
        names.add("John");
        System.out.println(names);
        names.add(null);
        System.out.println(names);
        names.add("Bill");
        System.out.println(names);


//        Добавление элемента по индексу
        names.add(1, "Mary");
        System.out.println(names);

//        names.add(5, "Jack"); // невозможно добавить по индексу, которого нет
//        System.out.println(names);

        names.add(3, "Jack"); // невозможно добавить по индексу, которого нет
        System.out.println(names);

        List<String> listCapacity = new ArrayList<>(20);
        System.out.println(listCapacity);

//        Метод для определения размера листа
        System.out.println("Names list size is " + names.size());
        System.out.println("listCapacity list size is " + listCapacity.size());

//        [John, Mary, Bill, Jack]
//        Изменить элемент - метод set(int index, новый элемент)
        names.set(2, "Ann");
        System.out.println(names);

        List<Integer> numbers = new ArrayList<>(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);
        numbers.add(23);
        System.out.println("numbers capacity size " + numbers);

//        получение элемента по индексу - метод get(int index)
        System.out.println(names.add("Kate"));
        System.out.println("names 0 pos is " + names.get(0));
        System.out.println("names 1 pos is " + names.get(1));
        System.out.println("names 2 pos is " + names.get(2));
        System.out.println("names 3 pos is " + names.get(3));
        System.out.println("names 4 pos is " + names.get(4));
        System.out.println(" at last position of names is " + names.get(names.size() - 1));
        System.out.println(names); // [John, Mary, Ann, Jack, Bill, Kate]

//        удаление элемента метод boolean remove(Object o) - удаление по названию, возвращает булеан
        System.out.println("Bill is removed? " + names.remove("Bill"));
        System.out.println(names);

//        удаление по индексу Object remove(int index) - удаление по индексу, возвращает удаленный объект
        System.out.println("Who is removed? " + names.remove(0));
        System.out.println(names);

        System.out.println(numbers); // [1, 2, 11, 23]
        numbers.remove(1);
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers);

//      int indexOf (Object o) - возвращает индекс элемента
        int position = names.indexOf("Ann");
        System.out.println("position of Ann is " + position);

//      boolean contains (Object o) - проверяет содержит ли лист данный элемент
        System.out.println(names.contains("Jack"));
        System.out.println(names.contains("Bill"));

        System.out.println(names);

//      сортировка коллекций
        Collections.sort(names);
        System.out.println(names);

        System.out.println("For Loop printing");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Enhanced For Loop printing");
        for (String name : names){
            System.out.println(name);
//            names.remove(0);
        }

        System.out.println("Iterator printing");
//        Iterator
        /*
        Итератор - один из методов интерфейса Collections. Он возвращает объект реализующий интерфейс Iterator.
        Методы интерфейса Iterator:
        - E next () - возвращает следующий элемент коллекции
        - boolean hasNext () - проверяет не достигнут ли конец коллекции, есть ли следующий элемент
        - remove () - удаляет текущий элемент (полученный последним вызовом метода next () )
         */
        Iterator<String> ourIterator = names.iterator();

        while (ourIterator.hasNext()){
            if(ourIterator.next().equals("Ann"))
                ourIterator.remove();
//            System.out.println(ourIterator.next());
        }
        System.out.println(names);

    }


}
