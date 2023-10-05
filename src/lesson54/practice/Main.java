package lesson54.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    Task 1.
    Пусть есть текстовый файл такого вида:
    1
    2
    3
    4
    5
    Нужно написать метод, принимающий содержимое этого файла и возвращающий сумму всех значений

    Task 2.
    Написать метод, принимающий текстовый файл, состоящий из нескольких строчек разной длины
    и возвращающий самую длинную строчку
    Пример:
    aaaa
    bbbbbb
    cc

    Task 3.
    Пусть есть текстовый файл вида:
    Peter,35
    Simon,5
    John,90
    Нужно написать метод, читающий этот файл и возвращающий список людей старше 18 лет, отсортированный по возарсту.
    Известно, что файл не пустой.
    public static List<Person> composeList(String fileName)

    Task 4.
    Пусть есть класс Person с полями name, age.
    Нужно написать метод, записывающий в файл объекты класса Person в виде строк.
    И одновременно выводящий на экран.
     */

    public static List<Person> composeList(String fileName) {
        List<Person> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                temp.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18) {
                persons.add(new Person(nameAge[0], age));
            }
        }
        Collections.sort(persons);
        return persons;
    }

    public static String findTheLongestStringInFile(File fileName) {

        String max = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > max.length()) {
                    max = line;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return max;
    }

    public static int sumOfValuesFromFile(String fileName) {
        int sum = 0;
        int value;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                value = Integer.parseInt(line);
                sum += value;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfValuesFromFile("test.txt"));

        File fileName = new File("output.txt");
        System.out.println(findTheLongestStringInFile(fileName));
    }

    /*

     */
}
