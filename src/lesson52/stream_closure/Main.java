package lesson52.stream_closure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    // закрытие ресурса с помощью try-catch-finally

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("output.txt");

            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        // try-with-resources - в этом случае метод close вызывается автоматически
        System.out.println("\n---------- try with resources -----------------");

        try (FileInputStream fileInputStream1 = new FileInputStream("output.txt")) {

            int i;
            while ((i = fileInputStream1.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    } // end main
}
