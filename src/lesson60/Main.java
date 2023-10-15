package lesson60;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // flatMap()

        String[] strings = {"hello", "java"};

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays::stream)
                .forEach(System.out::println);

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        // distinct() - возвращает только уникальные элементы, без дубликатов
        System.out.println("------------------");
        Stream.of("one", "two", "three", "one", "two")
                .distinct()
                .forEach(System.out::println);

        // skip(long n) - пропускает соответствующее количество элементов
        // limit(long n) - ограничивает поток количеством элементов n
        System.out.println("------------------");
        List<String> arr = Arrays.asList("one", "two", "three", "four", "five");

        arr.stream()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);


        //terminal operators - операции сведения (терминальные)
        /*
        это операции, возвращающие результат

        forEach()
        count() - возвращает количество элементов
         */
        System.out.println("------------------");
        System.out.println(arr.stream()
                .filter(s -> s.length() > 3)
                .count());

        // findFirst() - находит первый элемент в потоке
        // findAny() -

        System.out.println("---------------");
        Optional<String> first = arr.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = arr.stream().findAny();
        System.out.println(any.get());

        // boolean allMatch(), anyMatch(), noneMatch()
        /*
        allMatch(Predicate) - если все элементы удовлетворяют условию
        anyMatch() - если хотя бы один удовлетворяет условию предиката
        noneMatch() - если ни один элемент не удовлетворяет условию предикаты
         */
        System.out.println("---------------------");
        List<String> names = Arrays.asList("Jack", "Ann", "John", "Benjamin");
        boolean allElts = names.stream().allMatch(s -> s.length() > 2);
        System.out.println(allElts);

        boolean anyElt = names.stream().anyMatch(s -> s.length() > 6);
        System.out.println(anyElt);

        boolean noneElt = names.stream().noneMatch(s -> s.equals("Kate"));
        System.out.println(noneElt);


        // min(), max() - возвращают мин и макс значения, возвращают Optional, а принимают Comparator<T>
        System.out.println("--------------------");
        List<Integer> ints = Arrays.asList(1, 2, 34, 5, 60, 21);
        Optional<Integer> minElt = ints.stream().min(Integer::compare);
        Optional<Integer> maxElt = ints.stream().max(Integer::compare);
        System.out.println("min: " + minElt.get() + ", max: " + maxElt.get());

        // reduce() -
        // variant 1

        System.out.println("-------------");
        Optional<Integer> res = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a * b);
        System.out.println(res.get());

        Optional<String> resStr = Stream.of("hello", "java", "!").reduce((str1, str2) -> str1 + " " + str2);
        System.out.println(resStr.get());

        // reduce() - variant 2 - with 2 parameters, в этом случае нет Optional
        int result = Stream.of(1, 2, 3, 4, 5).reduce(2, (a, b) -> a * b);
        System.out.println(result);

        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> minElement = emptyList.stream().min(Integer::compare);
        if (minElement.isPresent())
            minElement.get();

        System.out.println(minElement.orElse(-1));
        Random random = new Random();
        System.out.println(minElement.orElseGet(() -> random.nextInt(10)));

        minElement.ifPresent(System.out::println);
        minElement.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("empty")
        );

        // collect(collector)
        //Collector<T,A,R> collector

        // некоторые методы класса Collectors
        /*
        toList() - собирает в лист
        toSet()
        toMap()
         */

        System.out.println("-------------------");
        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Opel");
        cars.add("BMW");
        cars.add("Ford");

        List<String> carsFilltered = cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toList());
        System.out.println(carsFilltered);

        Set<String> carsSet = cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toSet());

        Car car1 = new Car("Mercedes", 100_000);
        Car car2 = new Car("BMW", 150_000);
        Car car3 = new Car("Ford", 30_000);

        List<Car> carList = Arrays.asList(car1, car2, car3);

        Map<String, Integer> carMap = carList.stream()
                .collect(Collectors.toMap(Car::getBrand, Car::getPrice));

        System.out.println(carMap);

        carMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        ArrayList<Car> resCars = carList.stream().collect(Collectors.toCollection(ArrayList::new));


        System.out.println("------------");
        List<String> namesList = Arrays.asList("John", "Jack", "Ann", "Bill", "Peter", "Eugen");
        System.out.println(namesByLength(namesList));

        System.out.println("---------------");
        System.out.println(partitioningList(namesList));
    }

    // groupingBy collector - используется для группировки объектов по заданному свойству и сохранения результата в мапе.
    /*
    написать метод группирующий элементы листа строк в зависимости от длины строки и сохраняющий результаты в сетах.
    метод возвращает мапу
     */
    public static Map<Integer, Set<String>> namesByLength(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
    }

    /*
    partitioningBy - особый случай метода groupingBy, принимающий предикату и собирающий элементы стрима в мапу,
    в котрой в качестве ключей будетбулеановские значения, а в качестве значений - коллекции элементов.
    Ключ true - коллекция элементов , удовлетворяющий условию предикаты
    false - не удовлетворяющих

    Пример: написать метод, разделяющий элементы листа стрингов по длине строки >4
    и возвращающий мапу с ключами trut false и листами соответствующих элементов
     */

    public static Map<Boolean, List<String>> partitioningList (List<String> list){
        return list.stream()
                .collect(Collectors.partitioningBy(s -> s.length()>4));
    }

}



