package lesson49.findNumberWithoutPair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Homework45 {
    /*
    Написать метод, принимающий не пустой лист целых чисел ,
    в котором все числа кроме одного имеют пару и возвращающий это не парное число.
    При решении использовать мапу

    Примеры:
    1,3,1 -> 3
    3,3,3 -> 3
    1,1,15,1,1 -> 15
    1,8,8,8,8,8,1,2,2 -> 8
     */

    public int findNumberWithoutPair(List<Integer> ints) {
        Map<Integer, Integer> numbersByOccurrence = new HashMap<>();
        int result = 0;
        for (int i : ints) {
            if (numbersByOccurrence.containsKey(i)) {
                numbersByOccurrence.put(i, numbersByOccurrence.get(i) + 1);
            } else {
                numbersByOccurrence.put(i, 1);
            }
        }

        for (int key : numbersByOccurrence.keySet()) {
            if (numbersByOccurrence.get(key) % 2 != 0) {
                result = key;
            }
        }
        return result;
    }

    public int findNumberWithoutPairMerge(List<Integer> ints) {
        Map<Integer, Integer> numbersByOccurrence = new HashMap<>();
        int result = 0;
        for (int i : ints) {
            numbersByOccurrence.merge(i, 1, (oldValue, newValue)->oldValue+1);
        }

        for (int key : numbersByOccurrence.keySet()) {
            if (numbersByOccurrence.get(key) % 2 != 0) {
                return key;
            }
        }
//        return result;
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        Homework45 homework = new Homework45();

        List<Integer> ints = List.of(1,3,1);
        System.out.println(homework.findNumberWithoutPair(ints));
        System.out.println(homework.findNumberWithoutPairMerge(ints));

        List<Integer> ints2 = List.of(3,3,3);
        System.out.println(homework.findNumberWithoutPair(ints2));
        System.out.println(homework.findNumberWithoutPairMerge(ints2));

        List<Integer> ints3 = List.of(1,1,15,1,1);
        System.out.println(homework.findNumberWithoutPair(ints3));
        System.out.println(homework.findNumberWithoutPairMerge(ints3));

        List<Integer> ints4 = List.of(1,8,8,8,8,8,1,2,2);
        System.out.println(homework.findNumberWithoutPair(ints4));
        System.out.println(homework.findNumberWithoutPairMerge(ints4));
    }
}