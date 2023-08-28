package lesson30;

public class Practice {
    /* 1. написать свою реализацию метода substring, который работает также,
    принимающий 3 аргумента ( строку, индекс начала и индекс конца).
     */

    public static String mySubString(String string, int begin, int end) {
        // добавить доп проверки
        StringBuilder sb = new StringBuilder();
        for (int i = begin; i < string.length() && i < end; i++) {
            sb = sb.append(string.charAt(i));
        }
        return new String(sb);
    }

    /*
    2. Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)
     */
    public static boolean isAnagram(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            sb = sb.append(str1.charAt(i));
        }
        String result = new String(sb);
        return result.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(mySubString("Hello", 1, 30));

        System.out.println(isAnagram("asor", "rosa"));
        System.out.println(isAnagram("abc", "cba"));
        System.out.println(isAnagram("abc", "cbd"));
    }
}
