package lesson43.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample {
    // сохраняет порядок ввода
    public static void main(String[] args) {

    Map<Integer, String> ourLinkedHashMap = new LinkedHashMap<>();
        ourLinkedHashMap.put(23, "bbb");
        ourLinkedHashMap.put(2, "aaa");
        ourLinkedHashMap.put(1, "ccc");
        ourLinkedHashMap.put(118, "ddd");
        ourLinkedHashMap.put(100, "eee");

        System.out.println(ourLinkedHashMap);

        System.out.println("Put will retrun  null if ads");
        System.out.println(ourLinkedHashMap.put(123, "ttt")); //возвращает предыдущее значение этого ключа, но ключа такого не было, поэтому в этом случае возвращает null
        System.out.println(ourLinkedHashMap.put(23, "ttt"));

        System.out.println(ourLinkedHashMap);
    }
}
