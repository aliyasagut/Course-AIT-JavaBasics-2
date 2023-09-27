package lesson51.homework51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    /*
    Написать программу, сравнивающую два файла . Программа должна считывать файлы и затем сравнивать содержимое.
    Если найдено отличие, значит файлы не равны и программа выводит на экран соответствующее сообщение.
    Если конец обоих файлов достигается одновременно и отличий не найдено -
    значит файлы одинаковые и программа также выводит на экран соответствующее сообщение.
    Предварительно создать файлы в корневой директории first.txt, second.txt
     */
    public static void main(String[] args) throws FileNotFoundException {

        try (FileInputStream fileInputStream1 = new FileInputStream("output.txt");
             FileInputStream fileInputStream2 = new FileInputStream("newOutput.txt")) {

            byte[] buffer1 = new byte[2];
            byte[] buffer2 = new byte[2];

            int counter1 = 0;
            int counter2 = 0;
            boolean isEqual = true;


            while (true) {
                counter1 = fileInputStream1.read(buffer1);
                counter2 = fileInputStream2.read(buffer2);
                if (counter1 != counter2) {
                    isEqual = false;
                    break;
                } else if (counter1 == -1) {
                    isEqual = true;
                    break;
                }
                if (!Arrays.equals(buffer1, buffer2)) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("Files are equal");
            } else {
                System.out.println("Files are not equal");
            }
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------------------");

        compareFiles("output.txt", "newOutput.txt");

    }

    public static void compareFiles(String file1, String file2) throws FileNotFoundException {

        int i, j;
        try (FileInputStream f1 = new FileInputStream(file1);
             FileInputStream f2 = new FileInputStream(file2)) {

            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if(i != j){
                System.out.println("Files are differ");
            } else {
                System.out.println("Files are equal");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
