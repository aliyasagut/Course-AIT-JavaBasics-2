package lesson31.practice;

public class Practice {
    /*
    Написать метод, который принимает строку
    и возвращает количество вхождений паттерна в строку.

    Пример: ("Hello World", "l") -> 3
     */


    public static int howMuchPatterns(String string, String pattern) {
        int counter = 0;
        int index = string.indexOf(pattern);

        while (index != -1) {
            counter++;
            index = string.indexOf(pattern, index + 1);
        }
        return counter;
    }

    public static int howMuchPatterns2(String string, String pattern) {
        int count = 0;
        int lastIndex = string.lastIndexOf(pattern);

        for (int i = 0; i < string.length(); i++) {
            if (lastIndex != -1) {
                count++;
                lastIndex = string.lastIndexOf(pattern, lastIndex-pattern.length());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(howMuchPatterns("Hello world hello", "lo"));
        System.out.println(howMuchPatterns2("Hello world hello", "lo"));
    }
}
