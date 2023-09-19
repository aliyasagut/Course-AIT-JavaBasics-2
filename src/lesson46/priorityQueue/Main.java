package lesson46.priorityQueue;

import java.util.PriorityQueue;

public class Main {
    // Priority Queue
    /*
    Priority Queue - очередь, в которой можно изменить приоритет элементов, порядок работы.
     */
    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>(new PriorityComparator());
        names.add("aaa");
        names.add("a");
        names.add("aaaaa");
        names.add("aaaa");

        while (names.size() != 0){
            System.out.println(names.poll());
        }


    }
}
