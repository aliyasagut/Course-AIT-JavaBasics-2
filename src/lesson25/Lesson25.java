package lesson25;

import java.util.Arrays;

public class Lesson25 {
    public static void main(String[] args) {
        String str = "Hello";
        String str3 = "Hello";
        String str4 = "Hell";
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);
        System.out.println(str == str1);


        // создается пустая строка
        String str5 = new String();

        // массив чаров (символов)
        char[] array = {'h', 'e', 'l', 'l', 'o'};

        // Строка из массива символов
        String strArr = new String(array);
        System.out.println(strArr);

        String strStr = new String("Hello");
        System.out.println(strStr);


        // методы срок
        // charAt(int index) - возвращает символ на позиции index в строке

        String string = "Hello Java";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(4));
        System.out.println(string.charAt(5));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        System.out.println(string.charAt(8));
        System.out.println(string.charAt(9));

        String strHello = "Hello";
        System.out.println(strHello.charAt(0));
        System.out.println(strHello.charAt(4));

        System.out.println(strStr.length());
        System.out.println(strStr.charAt(strStr.length()-1));
//        System.out.println(strStr.charAt(8));

        // boolean equals (String str)
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        System.out.println(string1 == string2); // false
        System.out.println(string1.equals(string2)); // true
        System.out.println(string1.equals("Hello"));

        // compareTo(String string) - метод сравнивает две строки в соответствии
        // со значением каждого символа в таблице Unicode
        // строки сравниваются в алфавитном порядке
        // Если они равны, метод возвращает ноль.
        // Если одна строка больше, то возвращает положительное значение, если меньше - отрицательное.

        System.out.println("hello".compareTo("hello")); // 0
        System.out.println("ahello".compareTo("bhello"));// -1
        System.out.println("bhello".compareTo("ahello")); // 1

        // так можно тоже определить длину строки
        String empty = "";
        System.out.println("hello".compareTo(empty));

        // compareToIgnoreCase()

        String str10 = "begin";
        String str11 = "Begin";
        System.out.println(str11.compareTo(str10));
        System.out.println(str11.compareToIgnoreCase(str10));

        // 1. indexOf( int ch) - возвращает индекс позиции в строке, на которой в первый раз встречается символ ch
        /*
        2. int indexOf( char, int fromIndex) - возвращает индккс позиции в строке,
        на которой впервые встречается символ ch после индекса fromIndex

        3. indexOf( String str) - возвращает индекс строки str в той строке на которой он вызывается

        4. int indexOf( String str, int fromIndex) - возвращает индекс строки str
        в той строке на которой он вызывается после индекса fromIndex

        Все эти методы возвращают -1 в случае не нахождения.
         */

        String stringJava = "Java";

        int positionOfJ = stringJava.indexOf('J');
        int positionOfA = stringJava.indexOf('a');
        int positionOfA2 = stringJava.indexOf('a', 2);

        System.out.println("position of J is " + positionOfJ);
        System.out.println("position of a is " + positionOfA);
        System.out.println("position of a is " + positionOfA2);

        int positionOfAV = stringJava.indexOf("av");
        System.out.println("position of av is " + positionOfAV);

        int positionOfVA = stringJava.indexOf("va");
        System.out.println("position of va is " + positionOfVA);

        // lastIndexOf( char) - возвращает индекс последнего вхождения символа в строку
        // аналогично методу indexOf этот метод имеет четыре модификации
        /*
        lastIndexOf ( char, fromIndex )
        lastIndexOf ( string )
        lastIndexOf ( string, fromIndex )
         */

        stringJava = "JJava";
        int lastPosIfA = stringJava.lastIndexOf('a');
        int lastPosOfJ = stringJava.lastIndexOf('J');

        System.out.println("last index of a is " + lastPosIfA);
        System.out.println("last index of j is " + lastPosOfJ);

        // метод substring () - возвращает подстроку данной строки начиная с символа на позиции beginIndex

        System.out.println(stringJava.substring(1));
        System.out.println(stringJava.substring(0));

        // метод substring ( int beginIndex, int endIndex) - возвращает строку с beginIndex включительно и до endIndex НЕвключительно
        System.out.println(stringJava.substring(1, 4));

        // boolean startsWith ( String str ) - проверяет начинается ли строка со строки str
        // boolean startsWith ( String str, int fromIndex )

        String string25 = "Hello world";
        System.out.println(string25.startsWith("Hello"));
        System.out.println(string25.startsWith("He"));
        System.out.println(string25.startsWith("world"));
        System.out.println(string25.startsWith("world", 6));

        string25 = " Hello world";
        System.out.println(string25.startsWith(""));
        System.out.println(string25.startsWith("H"));


        // endsWith ( String suffix ) - проверяет заканчивается ли строка на suffix

        String stringABC = "helloABC";
        System.out.println("stringABC ends with ABC? " + stringABC.endsWith("abc".toLowerCase()));

        System.out.println("HeLLo".toLowerCase());
        String strToUpperCase = "hello";

        System.out.println("Hello to upper case " + strToUpperCase.toUpperCase());

        // concat () - соединение строк
        String hello1 = "Hello";
        String java = "Java";
        System.out.println(hello1.concat(" ").concat("Java").concat("!"));

        // join () - соединение строк
        String message = String.join("-", "Hello", "Java", "tra", "la", "la");
        System.out.println(message);

        // split ()
        String sentence = "Hallo Java and World";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        words[1] = "JavaScript";
        String result = String .join(" ", words);
        System.out.println(result);

        // toCharArray () - возвращает массив символов из данной строки
        String strA = new String("Java");
        char[] chars = strA.toCharArray();

        for (char c:chars){
            System.out.print(c + " ");
        }
        System.out.println();

        // static String valueOf() - возвращает строчное представление int , long, float, double, char

        String value23 = String.valueOf(23);
        System.out.println(value23 + 2);





    }
}
