package lesson26.pizza_factory;
    /*
    Проект "Pizza Factory".
    Нужно создать Фабрику по производству пиццы. Фабрика должна уметь готовить такие виды пиццы:
    Гаваии, Салями, Моцарелла.
    Каждый вид пиццы должен уметь: подготовливаться(готовиться тесто, накладывать ингредиенты) , печься и упаковываться.
    В каждом случае должно быть понятно, о каком виде пиццы идет речь.
    В классе main не должнен создаваться новый объект пиццы. Из него должен поступать заказ на изготовление нужного вида пиццы в класс PizzaFactory,
    который должен выбрать нужную пиццу для изготовления.

    Алгоритм реализации:
    1. нужно создать родит.абстракт.класс Pizza и три дочерних класса.
    2. Возможно не все методы родительского класса должны быть абстрактными,
       а только те, реализация которых в дочерних классах различна.
    3. Создать класс PizzaFactory, в котором будет осуществляться создание нового объекта Pizza в зависимости от выбора заказчика.
       ( возможно стоит использовать switch case )
    */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();
        Pizza salami = factory.createPizza("1");
        salami.orderPizza();

        System.out.println();
        Pizza mozzarella = factory.createPizza("2");
        mozzarella.orderPizza();

        System.out.println();
        Pizza hawaii = factory.createPizza("3");
        hawaii.orderPizza();

        System.out.println("===== with scanner =====");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please choose your Pizza: 1 - Salami, 2 - Mozzarella, 3 - Hawaii");
            String pizzaChoice = scanner.nextLine();

            Pizza newPizza = factory.createPizza(pizzaChoice);
            while (newPizza == null) {
                System.out.println("You've made wrong choice. Please choose your Pizza: 1 - Salami, 2 - Mozzarella, 3 - Hawaii");
                pizzaChoice = scanner.nextLine();
                newPizza = factory.createPizza(pizzaChoice);
            }

            newPizza.orderPizza();

            System.out.println("Do you want to order another Pizza? Press no if No / any other key if Yes");

        } while (!scanner.nextLine().equalsIgnoreCase("no"));
        System.out.println("Thank you for your order! We hope to see you soon!");


    }
}
