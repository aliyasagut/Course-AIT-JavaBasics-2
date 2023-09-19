package lesson46.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // Queue
    /*
    Очередь - это структура данных, работающая по принципу: первый пришел - первый ушел.
    FIFO - first in - first out.


     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add element
        queue.add("John");
        queue.add("Jack");
        queue.add("Mary");
        queue.add("Ann");

        System.out.println(queue);

        // delete element
        System.out.println(queue.remove()); // delete first

        System.out.println(queue.remove("Ann")); // delete ann

        System.out.println(queue);

        // poll() - удаляет и возвращает элемент из "головы" очереди. Если очередь пустая, он возвращает null

        System.out.println("Poll(): " +queue.poll());
        System.out.println("Poll(): " +queue.poll());
        System.out.println("Poll(): " +queue.poll()); //// returns null, if queue is empty
//        System.out.println("remove(): "+ queue.remove()); // returns exception, if queue is empty

        // offer() - дабавляет элемент в очередь
        queue.offer("John");
        queue.offer("Jack");
        queue.offer("Mary");
        queue.offer("Ann");

        // element() - возвращает голову очереди, то есть первый элемент
        System.out.println("Head of the queue is: "+queue.element());

        // peek() - возвращает элемент из начала очереди НЕ удаляя его (как get). Если очередь пустая - вернет null
        // poll() - возвращает элемент из начала очереди удаляя его. Если очередь пустая - вернет null
        // remove() - возвращает элемент из начала очереди удаляя его. Если очередь пустая - вернет exception



    }
}
