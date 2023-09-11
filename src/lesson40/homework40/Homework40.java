package lesson40.homework40;

import java.util.*;

public class Homework40 {
    /*
    С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов.
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

    public static List<String> removeDuplicates(List<String> list){
        if(list == null) throw new NullPointerException();
        Set<String> resultSet = new HashSet<>(list);
        List<String> result = new ArrayList<>(resultSet);
        return result;
    }
}
