package lesson40.homework40;

import java.util.*;

public class Homework40 {
    /*
    1.  С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов.

    2.  Написать метод, который принимает лист имен, в котором имена могут повторяться
        и возвращает лист повторяющихся элементов
    */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Viktoria");
        names.add("Harry");
        names.add("Leo");
        names.add("Susi");
        names.add("Viktoria");
        names.add("Harry");
        names.add("Leo");
        names.add("Susi");

        System.out.println(names);
        List<String> namesWithoutDuplicates = Homework40.removeDuplicates(names);
        System.out.println(namesWithoutDuplicates);

    }

    public static List<String> removeDuplicates(List<String> list) {
        if (list == null) throw new NullPointerException();
        Set<String> resultSet = new LinkedHashSet<>(list);
        List<String> result = new ArrayList<>(resultSet);
        return result;
    }

    List<String> getDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (String s : input) {
            if (!set.add(s) && !duplicates.contains(s))
                duplicates.add(s);
        }
        return duplicates;
    }
}
