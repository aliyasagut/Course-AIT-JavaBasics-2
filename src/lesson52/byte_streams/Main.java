package lesson52.byte_streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    /*
    ByteArrayInputStream
    ByteArrayOutputStream

    - это классы, которые можно использовать при работе с массивами байтов

    ByteArrayInputStream - источник данных - это массив байтов

    Конструкторы:
    ByteArrayInputStream(byte[] array)
    ByteArrayInputStream(byte[] array, int index, int number)

     */

    public static void main(String[] args) {
        System.out.println("----- ByteArrayInputStream -----------");
        byte[] bytes = new byte[]{1, 2, 3, 4};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int by;
        while ((by = byteArrayInputStream.read()) != -1) {
            System.out.print(by + " ");
        }

        // ByteArrayOutputStream - массив байтов в данном случае используется, как приемник данных
        /*
        ByteArrayOutputStream()
        ByteArrayOutputStream(int size)
         */
        System.out.println("\n----------- ByteArrayOutputStream ----------");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = "Hello Java";
        byte[] strBytes = str.getBytes();

        try {
            byteArrayOutputStream.write(strBytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(byteArrayOutputStream.toString()); // output#1

        byte[] ourArray = byteArrayOutputStream.toByteArray(); // output#2
        for (byte b : ourArray) {
            System.out.print((char) b);
        }

        // writeTo - с помощью этого метода можно вывести данные в другой поток

        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        String hello = "hello123";
        byte[] helloBytes = hello.getBytes();
        try {
            byteArrayOutputStream1.write(helloBytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {

            byteArrayOutputStream1.writeTo(fileOutputStream);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    } // end main
}











