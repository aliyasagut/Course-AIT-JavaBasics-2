package lesson54;

import java.io.File;
import java.io.IOException;

public class OurFileClass {

    // Class File - работает с файлами и каталогами и управляет информацией о них.
    /*
    Конструкторы:
    File(String путь к файлу/каталогу)
    File(String dir, String fileName)

    File dir1 = new File("C://dirName)

    Methods:
    boolean createNewFile() - создаст новы файл соответствующий переданному в конструктор пути
    boolean delete() - удаляет файл
    boolean exists() - проверяет существует ли такой файл
    String getAbsolutePath() - возвращает абсолютный путь к файлу
    String getName() - возвращает имя
    boolean isDirectory() - true, если это каталог
    boolean isFile() - true, если это файл
    long length() - размер в байтах
    String[] list() - возаращает массив файлов и одкаталогов, находящихся в определенном каталоге
     */


    public static void main(String[] args) throws IOException {

        File file = new File("example.txt");
        System.out.println("File name: " + file.getName());
        System.out.println("File exists? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.createNewFile());
        System.out.println("File exists? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.delete());
        System.out.println("File size: " + file.length());
    }// end main
}





