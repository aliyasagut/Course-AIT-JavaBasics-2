package lesson30;

import java.util.Arrays;

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
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

//        for (int i = 0; i < chars1.length; i++) {
//            if (chars1[i] != chars2[i]) return false;
//        }
//        return true;

        return Arrays.equals(chars1, chars2);

//        StringBuilder sb = new StringBuilder();
//        for (int i = str1.length() - 1; i >= 0; i--) {
//            sb = sb.append(str1.charAt(i));
//        }
//        String result = new String(sb);
//        return result.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(mySubString("Hello", 1, 30));

        System.out.println(isAnagram("asor", "rosa"));
        System.out.println(isAnagram("abc", "cba"));
        System.out.println(isAnagram("abcd", "cbad"));
        System.out.println(isAnagram("abc", "cbd"));
    }
}
