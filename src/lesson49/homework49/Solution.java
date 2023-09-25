package lesson49.homework49;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Solution {
    /*
    Написать метод, принимающий упорядоченный лист положительных целых чисел и целое число N и проверяющий есть ли в этом листе
    такие 2 числа что их произведение равно N. Метод в этом случае возвращает true иначе false
    {2,5,18,70}, 36 -> true
    {2,5,18,70}, 40 -> false

    {37, 38,48,23}, 36 -> false

    Решить задачу двумя способами :
    1. без вложенных циклов и без использования коллекций
    2. С использованием ArrayDeque
     */

    public boolean findProduct(List<Integer> numbers, int product) {
        int i = 0;
        int j = numbers.size() - 1;

        while (j - i > 0) {
            int mult = numbers.get(i) * numbers.get(j);
            if (mult < product) {
                i++;
            } else if (mult > product) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean findProductDeque(List<Integer> nums, int N) {
//        Deque<Integer> result = new ArrayDeque<>();
//        for (int num : nums) {                // if all elements in nums[] > 0
//            if (N % num == 0) {
//                result.add(num);
//            }
//        }
        Deque<Integer> result = new ArrayDeque<>(nums);

        while (result.size() > 1) {
            if (result.getFirst() * result.getLast() < N) {
                result.removeFirst();
            } else if (result.getFirst() * result.getLast() > N) {
                result.removeLast();
            } else {
                return true;
            }
        }
        return false;
    }
}
