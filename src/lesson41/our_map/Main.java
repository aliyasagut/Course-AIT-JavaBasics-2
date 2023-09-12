package lesson41.our_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    /*
    Интейрфейс Map
    4 класса:
    - HashTable
    - HashMap - не гарантирует порядок
    - LinkedHashMap - сохраняет порядок
    - TreeMap - сортирует

    Мапа представляет собой набор пар ключ-значение.
    В качестве ключей могут быть разные типы данных.
    Ключи в мапе уникальны. Значения могут повторяться.
     */
    public static void main(String[] args) {
        Map<Integer, String> ourMap = new HashMap<>();

        // добавить элемент
        ourMap.put(1200, "Notebook");
        ourMap.put(10, "Mouse");
        ourMap.put(500, "TV");
        ourMap.put(130, "Printer");

        System.out.println(ourMap);

        ourMap.put(10, "Clock");

        System.out.println(ourMap);

        // удалить элемент по ключу
        ourMap.remove(10);
        System.out.println(ourMap);

        // получить элемент
        System.out.println(ourMap.get(130));

        // размер
        System.out.println(ourMap.size());

        //  содержит ли данный ключ мапа, возвращает boolean
        System.out.println(ourMap.containsKey(1200));
        System.out.println(ourMap.containsKey(250));

        // содержит ли значение, возвращает boolean
        System.out.println(ourMap.containsValue("Notebook"));
        System.out.println(ourMap.containsValue("NTV"));

        // метод обхода мапы
        System.out.println(ourMap.keySet());

        Set<Integer> mapKeySet = ourMap.keySet();

    }
}
