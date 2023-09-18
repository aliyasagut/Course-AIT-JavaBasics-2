package lesson44.practice;

import java.util.*;

public class MapExercises {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

    }

    /*
    Пусть есть лист имен, где некотрые имена повторяются. Написать  метод, принимающий этот список и имя, а также
    возвращающий, сколько раз это имя повторяется в листе. В решении использовать мапу

    пример: [John, John, Bill, Ann] -> 2
     */

    public int nameToNumberOccurrence(List<String> names, String name) {
        Map<String, Integer> nameByNumber = new HashMap<>();
        int count = 0;
        for (String item : names) {
            if (nameByNumber.containsKey(item)) {
                nameByNumber.put(item, nameByNumber.get(item) + 1);
            } else {
                nameByNumber.put(item, 1);
            }
        }
//        if (nameByNumber.containsKey(name)) {
//            return nameByNumber.get(name);
//        }
//        return 0;

//        return nameByNumber.containsKey(name) ? nameByNumber.get(name) : 0;
        return nameByNumber.getOrDefault(name, 0);
    }

    /*
    Пусть есть список имен и их анаграм. Написать метод, принимающий этот лист и имя, по которому он возвращает
    список всех его анаграм, включая само имя. Решить с помощью мапы.

    Пример: [John, Jonh, Bill, lilb, Ann, nna, nan], Ann -> [ann, nna, nan]
     */

    public List<String> findAnagrams(String str, List<String> strings) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s : strings){
            String sortedKey = sortAnagram(s);

            if(anagrams.containsKey(sortedKey)){
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(str), List.of());
    }

    private String sortAnagram(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String((chars));
    }
}
