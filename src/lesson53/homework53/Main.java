package lesson53.homework53;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    /*
    Написать метод, читающий текстовый файл и возвращающий строку, состоящую из строчек этого файла.
     */
    public static String readFile(String fileName) {

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return stringBuilder.toString();
//        return new String(stringBuilder);
    }

    public static void main(String[] args) {

        String fileName = "test.txt";
        System.out.println(readFile(fileName));
    }
}
