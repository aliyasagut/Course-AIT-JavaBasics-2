package lesson45.map_merge;

import java.util.HashMap;
import java.util.Map;

public class DominantElement {
    /*
    Пусть есть масив целых положительных чисел.
    Нужно написать метод, находящий элемент (если такой есть),
    который встречается в массиве больше чем length/2.
    В противном случае вернуть -1


    Пример:
    {7, 7, 6, 7, 6} -> 7
    {4, 5, 5, 4, 4, 5} -> -1
    {3, 3} -> 3
     */
    public static void main(String[] args) {
        int[] ints = {7, 7, 6, 7, 6};
        int[] ints2 = {4, 5, 5, 4, 4, 5};
        int[] ints3 = {3, 3};

        DominantElement dominantElement = new DominantElement();

        System.out.println(dominantElement.findDominant(ints));
        System.out.println(dominantElement.findDominant(ints2));
        System.out.println(dominantElement.findDominant(ints3));

        System.out.println(dominantElement.findDominantMerge(ints));
        System.out.println(dominantElement.findDominantMerge(ints2));
        System.out.println(dominantElement.findDominantMerge(ints3));

    }

    public int findDominant(int[] ints) {
        Map<Integer, Integer> occurrencesByNumber = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            if (occurrencesByNumber.containsKey(ints[i])) {
                occurrencesByNumber.put(ints[i], occurrencesByNumber.get(ints[i]) + 1);
            } else {
                occurrencesByNumber.put(ints[i], 1);
            }
        }
        for (int key : occurrencesByNumber.keySet()) {
            if (occurrencesByNumber.get(key) > ints.length / 2) {
                return key;
            }
        }
        return -1;
    }

    public int findDominantMerge(int[] ints) {
        Map<Integer, Integer> occurrencesByNumber = new HashMap<>();

        for (int i : ints) {
            int res = occurrencesByNumber.merge(i, 1, (oldValue, newValue) -> oldValue + 1);
            if (res > ints.length / 2){
                return i;
            }
        }
        return -1;
    }
}
