package lesson33.animals;

import lesson28.interfaces2.A;

import java.util.Arrays;

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
        Arrays.sort(animals);
        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println("\n---Sort by Weight---");
        Arrays.sort(animals, new WeightComparator());
        for (Animal animal : animals)
            System.out.println(animal);

        System.out.println("\n---Sort by last letter of name---");
        Arrays.sort(animals, new LastLetterComparator());
        for (Animal animal : animals)
            System.out.println(animal.name);

    }
}
