package lesson43.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExercises {
    /*
    Дана Map<String, String> map
    Нужно написать метод, который вернет мапу, такую, что:
    если в исходной мапе есть ключи "а" и "b", то нужно создать новый ключ "аb"
    в качестве значения его должна быть сумма значений ключей "а" и "b"
    а если таких ключей нет, то ничего не менять

    Пример:
    mapAB {"a": "Hi", "b": "There"} -> {"a": "Hi", "ab": "HiThere", "b": "There"}
    mapAB {"b": "There"} -> {"b": "There"}
    mapAB {"a": "Hi"} -> {"a": "Hi"}
     */
    public static void main(String[] args) {

        Map<String, String> ourMap = new LinkedHashMap<>();
        ourMap.put("a", "hi");
        ourMap.put("b", "there");
        ourMap.put("c", "hi");
        ourMap.put("d", "there");

        MapExercises mapExercises = new MapExercises();
        System.out.println(mapExercises.createNewABMap(ourMap));
//        System.out.println(createNewABMap(ourMap));

    }

    public Map<String, String> createNewABMap(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String key = "a" + "b";
            String value = map.get("a").concat(map.get("b"));
            map.put(key, value);
        }
        return map;
    }

    /*
    2. Дан массив строк (не пустой). Написать метод возвращающий map <String, Boolean>,
    где каждая строка является ключом, а значение является true, если строка в массиве встречается больше одного раза
    и false, если только один раз

    Примеры:
    [a,b,a,c,b] -> a:true, b:true, c:false
    [a,b,c] -> a:false, b:false, c:false
    [c,c,c] -> c:true

    containsKey

    + протестировать
     */
}
