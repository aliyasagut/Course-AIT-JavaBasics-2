package lesson61.more_collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    // сосчитать количество элементов в листе
    public static long countElements(List<String> list) {
        return list.stream().count();
    }

    public static int maxElt(List<Integer> list) {
//        return list.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        return list.stream().max(Comparator.naturalOrder()).get();
    }

    // joining() - собирает элементы в строку
    // объедеинить имена из листа в строку такого вида name1name2name3
    public static String convertToStr(List<String> names){
        return names.stream().collect(Collectors.joining());
    }
    // объедеинить имена из листа в строку такого вида name1, name2, name3
    public static String convertToStrWithComma(List<String> names){
        return names.stream().collect(Collectors.joining(", "));
    }
    // объедеинить имена из листа в строку такого вида Students: name1, name2, name3 studying jAVA
    public static String convertToStrWithPrefix(List<String> names){
        return names.stream().collect(Collectors.joining(", ", "Students: ", " study Java"));
    }

    //main
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ann", "Kate", "Bill");
        System.out.println(convertToStr(names));
        System.out.println(convertToStrWithComma(names));
        System.out.println(convertToStrWithPrefix(names));

        // Параллельные потоки
        /*
        два метода предварещения потока из последовательного в параллельный
        1. parallel() из Stream
        2. parallelStream() из Collection
         */

        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> result = numbers.parallel().reduce(Integer::sum);
        System.out.println(result.get());

        names = Arrays.asList("Jack", "John", "Kate", "Bill", "Ann");
        System.out.println(" regular stream"); // порядок как в листе
        names.stream().filter(name -> name.length()>3).forEach(System.out::println);

        System.out.println("\nparallel stream"); // порядок не определен и не гарантирован
        names.parallelStream().filter(name -> name.length()>3).forEach(System.out::println);




    }// end of main
}
