package lesson53.char_streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    //Ввод - вывод текстововй информации
    /*
    Reader, Writer - абстрактные классы, лежащие в основе иерархии классов, работающих с вводом-выводом
    символьной информации.

    Reader - отвечает за чтение

    Методы:
    int read() - возвращает текущий символ потока (его целочисленное представление)
                и -1 если символов нет
    int read(char[] chars) - считывает в массив data символы с потока и возвращает количесвто успешно считанные,
                в конце возвращает -1
    int read(char[] data, int index, int number)
    close()
    skip(long count) - пропускает количество символов count

    Writer - базовый класс всех символьных пототков, работающих на вывод

    Матоды:
    void write(int ch)
    void write(char[] chars)
    abstract void write (char[] chars, int index, int number)
    close()
    append(char ch) - в конец выходноего потока добавляет символ ch
    append(CharSequence char) - в конец выходноего потока добавляет набор символов ch

    Запись в файл - класс FileWriter

    конструкторы:
    FileWriter(String fileName)
    FileWriter(String fileName, boolean append)
    FileWriter(File fileName)
    FileWriter(File fileName, boolean append)


     */
    public static void main(String[] args) {
//        try (FileWriter writer = new FileWriter("test.txt", true)) {
//            String word = "Hello everybody!";
//            writer.write(word);
//            writer.append('\n');
//            writer.append('J');
//            writer.append('a');
//            writer.append('\n');
//
//            writer.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        /*
        класс FileReader - чтение текстовых файлов
        Констукторы:
        FileReader(String fileName)
        FileReader(File fileName)
         */

//        try (FileReader reader = new FileReader("test.txt")) {
//            int ch;
//            while ((ch = reader.read()) != -1) {
//                System.out.print((char) ch);
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // with array

        try(FileReader reader = new FileReader("test.txt")){

            char[] data = new char[512];
            int counter;
            while ((counter = reader.read(data)) > 0){
                if(counter <512){
                    data = Arrays.copyOf(data, counter);
                }
                System.out.print(data);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }// end main
}













