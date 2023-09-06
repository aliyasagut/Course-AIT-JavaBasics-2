package lesson37.homework37;

import java.util.Arrays;
import java.util.List;

public class Homework {
    /*
    Задача 1
    Написать метод, принимающий не пустой лист строк и возвращающий строку, которая
    встречается раньше в листе - самую короткую или самую длинную. Все строки в листе разной длины
     */
    public static void main(String[] args) {
        Homework homework = new Homework();

        List<String> listStr = Arrays.asList("ten", "two three", "a", "twenty one", "four and five", "five");
        String result = homework.returnTheFirstLongestOrShortest(listStr);
        System.out.println(result);

    }

    public String returnTheFirstLongestOrShortest(List<String> list) {
        String minSizeString = list.get(0);
        int minIndex = 0;
        String maxSizeString = list.get(0);
        int maxIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minSizeString.length()) {
                minSizeString = list.get(i);
                minIndex = i;
            }
            if (list.get(i).length() > maxSizeString.length()) {
                maxSizeString = list.get(i);
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            return minSizeString;
        } else {
            return maxSizeString;
        }
    }
}
