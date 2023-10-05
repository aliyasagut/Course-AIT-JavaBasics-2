package lesson53.buffered_reader_writer;

import java.io.*;

public class Main {
    /*
    BufferedReader
    BufferedWriter
    - классы, используемые для буфферизации символьных потоков

    BufferedWriter - класс, записывающий символы в поток, буфферизуя их предварительно.

    Конструкторы:
    BufferedWriter(Writer out)
    BufferedWriter(Writer out, int size)

    */
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"))) {
            String sentence = "Hello java and everyone!";
            bufferedWriter.write(sentence);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // BufferedReader
        /*
        BufferedReader(Reader in)
        BufferedReader(Reader in, int size)
         */

        System.out.println("Buffered Reader - read()");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        System.out.println("\nBufferedReader - readLine()");
        // readLine() - собственный метод класса BufferedReader, возвращающий строку, позволяет считывать информацию построчно

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // чтение с консоли с помощью bufferedReader и запись это инвормации в файл с помощью BufferedWriter

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("EXIT")){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }// end main
}
