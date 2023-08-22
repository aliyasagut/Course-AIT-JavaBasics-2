package lesson25;

import java.util.Arrays;

public class Homework25 {
    public static void main(String[] args) {

//      Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
        System.out.println("\n======Task 1======");
        String str1 = "testHello";
        String str2 = "Hello";

        System.out.println(strEndsWithAnotherStr(str1, str2));

//      Написать метод, создающий массив символов из содержимого строки
        System.out.println("\n======Task 2======");
        String str3 = "We live in a beautiful world";
        System.out.println(Arrays.toString(createsCharArray(str3)));

//      Написать метод, удаляющий из строки повторяющиеся символы
        System.out.println("\n======Task 3======");
        String test = "abbccccaadb";
        System.out.println(removeDublicateChars(test));
    }

    // methods
    public static String removeDublicateChars(String str) {
        char[] arr = str.toCharArray();
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (result.indexOf(arr[i]) == -1) {
                result += arr[i];
            }
        }
        return result;
    }

//        char[] result = new char[str.length()];
//        int counter = 0;
//        for (int i = 0; i < str.length(); i++) {
//            arr[i] = str.charAt(i);
//        }
////        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isCharPresentInResult = false;
//            for (int j = 0; j < counter; j++) {
//                if (arr[i] == result[j]) {
//                    isCharPresentInResult = true;
//                    break;
//                }
//            }
//            if (isCharPresentInResult == false) {
//                result[counter] = arr[i];
//                counter++;
//            }
//        }
////        System.out.println(Arrays.toString(result));
//        String resultStr = new String(result, 0, counter);
//        System.out.println(resultStr);

    public static boolean strEndsWithAnotherStr(String str1, String str2) {
        return str1.endsWith(str2);
    }

    public static char[] createsCharArray(String str) {
        return str.toCharArray();
    }
}
