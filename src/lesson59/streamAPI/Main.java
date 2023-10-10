package lesson59.streamAPI;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int[] ints = {10, 20, 30, 40, 50, 60, 70};

        int counter = 0;
        for (int i : ints) {
            if (i < 21) {
                continue;
            }
            i = i * 2;
            counter++;
            if (counter > 3) {
                break;
            }
            System.out.println(i);
        }

        // через stream
        System.out.println("--------Example with Stream--------");

        IntStream.of(10, 20, 30, 40, 50, 60, 70)
                .filter(i -> i >= 21)
                .map(i -> i * 2)
                .limit(3)
                .forEach(System.out::println);
        /*
        Stream API - это поток данных
        Операторы в стримах можно разделить на:
        - промежуточные - после обработки данных они возвращают стрим.
        Промежуточных операторов может быть несколько
        - терминальные - после обработки элементов завершают работу стрима.
        т. е. терминальный оператор может быть только один.

        Обработка данных не начнется пока не будет вызван терминальный оператор.

        Больше одного раза использовать стрим нельзя.

        Варианты создания стримов:

         */
        Stream<String> empty = Stream.empty(); // создание пустого стрима

        Collection<String> collection = Arrays.asList("One", "Two", "Three"); // Стрим коллекции
        collection.stream();

        String[] array = {"One", "Two", "Three"};
        Arrays.stream(array); // Стрим массива

        String str = "abcde";
        str.chars(); // стрим строки

        Stream.of("One", "Two", "Three"); // stream с помощью статического метода of()

        // стримы примитивов
        IntStream intStream = IntStream.of(1, 2, 3);
        IntStream.range(1, 3); //1,2 - создание стрима целых чисел в диапазоне от 1 до 3, не включая 3
        IntStream.rangeClosed(1, 3); //1,2,3 - включая 3


        // стрим примитивов с помощью класса Random

        Random random = new Random();
        random.doubles();

        System.out.println();
        // терминальный оператор - метод forEach() - перебор элементов, принимает consumer
        Stream<String> fruits = Stream.of("Apple", "orange", "Lemon", "kiwi");
        fruits.forEach(System.out::println);

        // промежуточные операторы
        // filter() - Принимает предикату(условие) и возвращает поток из элементов удовлетворяющих этому условию
        System.out.println("-----------after filter------------");
        fruits = Stream.of("Apple", "orange", "Lemon", "kiwi");
        fruits.filter(f -> f.length() == 5).forEach(System.out::println);

        System.out.println("----------");
        Stream<Car> cars = Stream.of(new Car("mercedes", 100_000),
                new Car("Volvo", 80_000),
                new Car("Bently", 500_000));

        cars.filter(car -> car.getPrice() < 200_000).forEach(car -> System.out.println(car.getBrand()));

        // map() - маппинг, отображение, преобразование одного объекта (например в другой)
        // принимает function

        System.out.println("---------------");
        cars = Stream.of(new Car("mercedes", 100_000),
                new Car("Volvo", 80_000),
                new Car("Bently", 500_000));
        cars.filter(car -> car.getPrice() < 200_000)
                .map(Car::getBrand)
                .forEach(System.out::println);

        System.out.println("-----------------");
        cars = Stream.of(new Car("mercedes", 100_000),
                new Car("Volvo", 80_000),
                new Car("Bently", 500_000));
        cars.map(car -> "brand: " + car.getBrand()+ "Price: "+ car.getPrice())
                .forEach(System.out::println);

        // sort() - сортировка
        System.out.println("------------");
        List<String> carList = new ArrayList<>();
        carList.add("mercedes");
        carList.add("volvo");
        carList.add("bentley");
        carList.add("opel");

        carList.stream()
                .filter(car -> car.length() >4)
                .sorted()
                .forEach(System.out::println);




    }// end main


}
