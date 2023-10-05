package lesson53;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Предопределенные стандартные стримы (predefined streams)
        // в классе System определены три объукта стримов - in, out, err
        /* в пакете java.lang
        это объекты public, final, static
        System.out - это объект типа output stream и по умолчанию это консоль (объект класса PrintStream)
        System.in - стандартный ввод, по умолчанию консоль (объект типа InputStream)
        System.err - стандартный вывод для ошибок, по умолчанию консоль (объект класса PrintStream)

        эти стримы байтовые, не символьные

        System.in (объект типа InputStream)
        int read() throws IOException
        int read(byte[] data)
        int read(byte[] data, int start, int max)

         */

//        char ch;
//        System.out.println("press key and then ENTER");
//        ch = (char) System.in.read();
//        System.out.println("You've entered "+ ch);

//        byte[] data = new byte[10];
//        System.out.println("enter several characters");
//        System.in.read(data);
//        System.out.println("you've entered the following:");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print((char) data[i]);
//        }
//        System.out.println();

        // System.out - объект класса PrintStream

        System.out.println();

        /*
        several Конструкторы класса PrintStream
        PrintStream(OutputStream output)
        PrintStream(OutputStream output, boolean autoFlush)
        PrintStream(String fileName)
        PrintStream(File fileName)

        методы:
        pritnln()
        print()
        printf()
         */

        String hello = "hello java";

        try(PrintStream printStream = new PrintStream(new FileOutputStream("test.txt"))){
            printStream.println(hello);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(PrintStream printStream = new PrintStream("output.txt")){
            printStream.print("Hello hellochen! ");
            printStream.println("Hello java!");

            String word = "print";
            byte[] wordByte = word.getBytes();
            printStream.write(wordByte);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}














