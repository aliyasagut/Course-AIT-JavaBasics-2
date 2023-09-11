package lesson40.set_java;

import java.util.*;

public class Main {
    // Set
    /*
    Set это коллекция, котрая не может содержать дубликатов.

    Hashset
    1. Hashset использует в основе HashTable
    2. не гарантирует порядка, в котором хранятся и возвращаются элементы
    3. не допускает дубликатов
    4. можно поместить null
     */

    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        // добавление элмента
        System.out.println(hashSet.add("aa"));
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");

        System.out.println(hashSet);

        //распечатка через for
        for(String s:hashSet){
            System.out.println(s);
        }

        System.out.println(hashSet.add("aa"));
        System.out.println(hashSet.add("bb"));
        System.out.println(hashSet);

        // удалить элемент remove() по значению
        hashSet.remove("bb");
        System.out.println(hashSet);

        // size()
        System.out.println(hashSet.size());

        //contains()
        System.out.println(hashSet.contains("aa"));

        //isEmpty()
        System.out.println(hashSet.isEmpty());

        //действия через iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("==== HashSet ======");
        Set<String> namesSet = new HashSet<>();
        namesSet.add("John");
        namesSet.add("Mary");
        namesSet.add("Peter");
        namesSet.add("Ann");
        namesSet.add("Bill");

        System.out.println(namesSet);

        // LinkedHashSet - поддерживает порядок ввода элементов
        System.out.println("===== LinkedHashSet ======");
        Set<String> linkedNamesSet = new LinkedHashSet<>();
        linkedNamesSet.add("John");
        linkedNamesSet.add("Mary");
        linkedNamesSet.add("Peter");
        linkedNamesSet.add("Ann");
        linkedNamesSet.add("Bill");
        System.out.println(linkedNamesSet);

        // TreeSet - сортирует элементы

        System.out.println("===== TreeSet =====");
        Set<String> treeSetNames = new TreeSet<>();
        treeSetNames.add("John");
        treeSetNames.add("Mary");
        treeSetNames.add("Peter");
        treeSetNames.add("Ann");
        treeSetNames.add("Bill");
        System.out.println(treeSetNames);

        // intersection
        // union
        // relative compliment

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(4);
        setB.add(6);
        setB.add(8);
        System.out.println(setA);
        System.out.println(setB);

        // intersection
        System.out.println("=====Intersection======");
        Set<Integer> intersectSet = new HashSet<>(setA);
        intersectSet.retainAll(setB);
        System.out.println(intersectSet);

        //union
        System.out.println("=====Union======");
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println(unionSet);

        //relative compliment
        System.out.println("===== relative compliment ======");
        Set<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println(differenceSet);

        /*
        С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов.
         */

    }


}
