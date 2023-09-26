package lesson50.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    /*
    В ресторан периодически попадает заказ. У заказа есть время, когда он был сделан ( milliseconds ).
    Для каждого заказа нужно определить количество заказов, сделанных за N  минут до него.
    @param orderTimes -  массив отсортированных по времени моментов, когда происходили заказы
    @param minutes
    @return  для соответствующего заказа возвращает количество заказов, сделанных в предыдущие minutes минут
    public int[] countOrdersNumber(long[] orderTimes , int minutes)

    long[] orderTimes ={1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000}
    minutes = 5 min
    millis = 5 *60 *1000 = 300 000
    int[] result =    {0, 1, 2, 3, 1, 1,2,3,4 }

    написать метод с использованием двусторонней очереди

    Алгоритм:
    1. создать массив result (кол-во элемеетов равно количеству элементов во входящем массиве)
    2. перевести минуты во втором параметре в милисекунды
    3. создать новую ArrayDeque
    4.
     */
    public int[] countOrdersNumberMy(long[] orderTimes, int minutes) {
        int[] result = new int[orderTimes.length];
        int millis = minutes * 60 * 1000;

        Deque<Long> myDeque = new ArrayDeque<>();
        myDeque.addFirst(orderTimes[orderTimes.length - 1]);

        int cursor = orderTimes.length - 2;
        int resultCursor = orderTimes.length - 1;

        while (!myDeque.isEmpty()) {
            if (cursor >= 0) {
                long current = orderTimes[cursor];

                if ((myDeque.getLast() - current) <= millis) {
                    myDeque.addFirst(current);
                    cursor--;
                    continue;
                }
            }
            myDeque.removeLast();
            int size = myDeque.size();
            result[resultCursor] = size;
            resultCursor--;

        }
        return result;
    }

    public int[] countOrdersNumber(long[] orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];
        Deque<Long> queue = new ArrayDeque<>();
        long millis = minutes * 60L * 1000;
        int i = 0;

        for (long orderTime : orderTimes) {
            queue.addLast(orderTime);
            while (orderTime - queue.getFirst() > millis) {
                queue.removeFirst();
            }
            res[i++] = queue.size() - 1;
        }
        return res;
    }


    public static void main(String[] args) {

        long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000};
        Solution solution = new Solution();

        int[] result1 = solution.countOrdersNumberMy(orderTimes, 5);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        int[] result2 = solution.countOrdersNumber(orderTimes, 5);

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

    }


}
