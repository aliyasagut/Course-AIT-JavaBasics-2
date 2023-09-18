package lesson43.homework43;

import java.util.LinkedHashMap;
import java.util.Map;

public class Homework43 {
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
    public static void main(String[] args) {
        String[] strings = {"monday", "monday", "tuesday", "tuesday", "wednesday", "thursday", "friday"};

        Homework43 homework = new Homework43();
        System.out.println(homework.createStrBooleanMap(strings));

    }

    public Map<String, Boolean> createStrBooleanMap(String[] strings) {
        Map<String, Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], true);
            } else {
                map.put(strings[i], false);
            }
        }
        return map;
    }

    public Map<String, Boolean> createStrBooleanMap2Variant(String[] strings) {
        Map<String, Boolean> map = new LinkedHashMap<>();
        for (String string : strings){
            map.put(string, map.containsKey(string));
        }
        return map;
    }
}
