package lesson33.animals;

import lesson28.interfaces2.A;

import java.util.Arrays;
import java.util.Comparator;

public class AnimalMain {
    /*
    создать класс Animal c полями name, weight, colour
    Использую компораторы вывести на экран список животных, упоядоченный по:
    1. имени
    2. весу
    3. список имен животных, упорядоченный по возрастанию последней буквы имени
     */
    public static void main(String[] args) {


        Animal wolf = new Animal("wolf", 12, "grey");
        Animal bear = new Animal("bear", 30, "braun");
        Animal fox = new Animal("fox", 10, "red");
        Animal elephant = new Animal("elephant", 100, "grey");
        Animal anakonda = new Animal("anakonda", 5, "yellow");

        Animal[] animals = {wolf, bear, fox, elephant, anakonda};

        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println("\n---Sort by Name---");
//        AnimalComparatorInterface comparatorByName = (a, b) -> a.name.compareTo(b.name);
        Comparator<Animal> comparatorByName = (a, b) -> a.name.compareTo(b.name);
        //Arrays.sort(animals, (a, b) -> a.name.compareTo(b.name));
        Arrays.sort(animals, comparatorByName);

        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println("\n---Sort by Weight---");
//        AnimalComparatorInterface comparatorByWeight = (a, b) -> Integer.compare(a.weight, b.weight);
        Comparator<Animal> comparatorByWeight = (a, b) -> Integer.compare(a.weight, b.weight);
        Arrays.sort(animals, comparatorByWeight);
        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println("\n---Sort by last letter of name---");
//        AnimalComparatorInterface comparatorByLastChar = (a, b) -> {
        Comparator<Animal> comparatorByLastChar = (a, b) -> {
            char lastCharA1 = a.name.charAt(a.name.length()-1);
            char lastCharA2 = b.name.charAt(b.name.length()-1);
            return Character.compare(lastCharA1,lastCharA2);
        };
        Arrays.sort(animals, comparatorByLastChar);
        for (Animal animal : animals)
            System.out.println(animal.name);

    }
}
