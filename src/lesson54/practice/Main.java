package lesson54.practice;

import java.io.*;
import java.util.*;

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
                persons.add(new Person(nameAge[0].trim(), age));
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

    public static void writeToFile(String fileName, List<Person> persons) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
             BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))) {

            for (Person person : persons) {
                bw.write("\"" + person.name + "\"" + "," + person.age);
                bw1.write("\"" + person.name + "\"" + "," + person.age);
                bw.newLine();
                bw1.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    /*
    Task 5.
    Пусть есть файл содержащий следующую информацию:
    name, surname(могут повторяться), equipment, price.

    Написать метод, принимающий имя файла, который записывакт информацию в другой файл в таком виде:
    Name surname sumPrice

    Eugene, Black, notebook, 1000
    Peter, While, mac, 800
    Eugene, Black, keyboard, 25
    John, Green, Mouspad, 5
    Peter, While, mobile, 600

    Eugene Black 1025
    Peter While 1400
    John Green 5

     */
    public static void writeToModifiedListInFile(String inFile, String outFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile, false))) {

            String line;
            Map<String, Integer> result = new HashMap<>();

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] entry = line.split(",");
                String name = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());

                int currentValue = result.getOrDefault(name, 0);
                int newValue = currentValue + price;
                result.put(name, newValue);

//                if (result.containsKey(name)) {
//                    result.put(name, price + result.get(name));
//                } else {
//                    result.put(name, price);
//                }


            }

            for (Map.Entry<String, Integer> me : result.entrySet()) {
                bw.write(me.getKey() + ' ' + me.getValue());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        System.out.println(sumOfValuesFromFile("test.txt"));
//
//        File fileName = new File("output.txt");
//        System.out.println(findTheLongestStringInFile(fileName));

//        System.out.println(composeList("newOutput.txt"));

//        Person person1 = new Person("Peter", 35);
//        Person person2 = new Person("Violetta", 25);
//        Person person3 = new Person("Susi", 0);
//
//        List<Person> personList = Arrays.asList(person1, person2, person3);
//
//        writeToFile("test.txt", personList);

        String inFile = "test.txt";
        String outFile = "newOutput.txt";
        writeToModifiedListInFile(inFile, outFile);
    }
}






