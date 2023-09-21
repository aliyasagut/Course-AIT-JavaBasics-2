package lesson47_48.homework47;

public class Homework {
    /*
    1. Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
    int a = 40/0

    2. Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
    String s =null;
    String m = s.toLowerCase()

    3. Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
    int[] m = new int[2]
    m[8]=5
     */

    public static void main(String[] args) {

        System.out.println("---------- Task 1 --------------");

        try {
            int a = 40 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
            System.out.println(e.getMessage());
        }

        System.out.println("---------- Task 2 --------------");

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("Can't handle null");
            System.out.println(e.getMessage());
        }

        System.out.println("---------- Task 3 --------------");

        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't find element");
            System.out.println(e.getMessage());
        }
    }
}
