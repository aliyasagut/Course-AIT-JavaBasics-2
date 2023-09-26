package lesson51.io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
    IO Streams
    Ввод-вывод, потоки ввода-вывода

    Понятие потока (абстракция) является в данном случае ключевым.
    Объект, из котрого считываются данные, это поток ввода программы.
    А объект, в котрый записываются данные, - поток вывода.

    Все классы, работающие с вводом-выводом делятся на две большие группы:
    классы, работающие с байтами, и классы, работающие с символами.
    В основе всех классов, работающих с байтами лежат два абстрактных класса - InputStream, OutputStream,
    а классов, котрые работают с символами - Reader, Writer.

    Потоки байтов

    === InputStream - это базовый класс для всех классов, работающих с байтовыми потоками ввода.

    Главные методы:

    void close() - закрывает поток
    int read() - возвращает текущий байт из потока (возвращает в целочисленном виде)
                 когда байтов в потоке не остается, метод вернет -1
    int read(byte[] buffer) - считывает байты из потока в буферный массив.
                 возвращает число считанные байтов. Если ничего не считано, то он вернет -1
    int read(byte[] buffer, int index, int number) -
                 buffer - массив байтов, в котрые записываются считанные байты
                 index - индекс этого массива buffer[index], начиная с которого записываются байты
                 number - количество байтов, которое нужно считать
    skip(long number) - пропускает при чтении количество байтов равных number
    available() - возвращает количество байтов, доступных для чтения в потоке


    === OutputStream - базовый класс для всех классов, которые работают с байтовыми потоками вывода (записи).

    Главные методы:

    void close() - закрывает поток
    void flush() - сбрасывает содержимое буфера вывода а поток
    void write(int byte) - записывает в выходной поток один байт
    void write(byte[] buffer) - записывает в выходной поток массив байтов buffer
    void write(byte[] buffer, int index, number) -
                 buffer - массив байтов
                 index - индекс этого массива buffer[index], начиная с которого записываются байты
                 number - количество байтов, которое нужно записать


    === FileOutputStream - используется для записи байтов в файл. Наследует класс OutputStream.

    конструкторы:
    FileOutputStream(String fileName)
    FileOutputStream(File file)
    FileOutputStream(String fileName, boolean append)
    FileOutputStream(File file, boolean append)
     если append = true, то данные добавляются в конец
     если false, то файл перезаписывается полностью


     */
    // File newFile = new File("text.txt");

    public static void main(String[] args) {
        String str = "Hello Java";

        // try with resources
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            byte[] buffer = str.getBytes();

            fileOutputStream.write(buffer, 0, buffer.length);

            System.out.println("We did it!");
//            fileOutputStream.write(buffer[0]);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // FileInputStream - для чтения файлов
        // FileInputStream(String fileName)
        System.out.println("----------------------------------------");
        try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("-------------------- Reading in buffer array -----------------------");
        // Чтение в буфферный массив
        try (FileInputStream fin = new FileInputStream("output.txt")) {

            byte[] buffer = new byte[512];

            int counter;
            while ((counter = fin.read(buffer)) != -1) {
                for (int i = 0; i < counter; i++) {
                    System.out.print((char) buffer[i]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // чтение и запись

        try (FileInputStream fileInputStream = new FileInputStream("output.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("newOutput.txt")){
            byte[] buffer = new byte[512];

            int counter;

            while((counter = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0, counter);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
