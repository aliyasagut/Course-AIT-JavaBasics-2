package lesson43.TreeMapExample;

import java.util.*;

public class TreeMapExample {
    /*
    TreeMap
    - хранит элементы в красно-черном дереве, упорядоченными по возрастанию в соответствии с естественным порядком.
     */
    public static void main(String[] args) {
        Map<Integer, String> ourTreeMap = new TreeMap<>();
        ourTreeMap.put(23, "bbb");
        ourTreeMap.put(2, "aaa");
        ourTreeMap.put(1, "ccc");
        ourTreeMap.put(118, "ddd");
        ourTreeMap.put(100, "eee");

        System.out.println(ourTreeMap);

        System.out.println("________________Map with Iterator___________________________");

        // перебор мапы с помощью итератора
        // получить набор ключ-значение с помощью метода entrySet()
        Set<Map.Entry<Integer, String>> set = ourTreeMap.entrySet();

        // получить объект итаратора для нашего сета пар
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        // перебор в цикле с помощью методов hasNext() и next()
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> me = iterator.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }


        // В treeMap можно изменить порядок сортировки, передав в ее конструктор соответствующий компаратор

        Map<String, String> mapReverse = new TreeMap<>(Collections.reverseOrder());
        mapReverse.put("k1", "Jack");
        mapReverse.put("k4", "Mary");
        mapReverse.put("k3", "Ann");
        mapReverse.put("k2", "John");
        mapReverse.put("k5", "Lucy");

        System.out.println(mapReverse);

    }
}
