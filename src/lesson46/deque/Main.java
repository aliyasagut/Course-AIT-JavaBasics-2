package lesson46.deque;

import java.util.ArrayDeque;

public class Main {
    // Deque
    /*
    Deque - внунаправленная очередь

    расширяет класс Queue

    addFirst (elt) - добавляет элемент в начало
    addLast (elt) - добавляет элемент в конец

    offerFirst (elt) - возвращает true/False
    offerLast (elt) - возвращает true/False

    getFirst() - возвращает первый элемент без удаления, при пустой очереди вернет exception
    peekFirst() - возвращает первый элемент без удаления, при пустой очереди вернет null

    getLast() - возвращает последний элемент без удаления, при пустой очереди вернет exception
    peekLast() - возвращает последний элемент без удаления, при пустой очереди вернет null

    pollFirst() - возвращает с удалением из начала
    removeFirst() -

    pollLast() - возвращает с удалением из конца
    removeLast()

    pop() - возвращает с удалением из начала, при пустой очереди вернет exception
    push() - дабавляет элемент в самое начало очереди

     */
    public static void main(String[] args) {
        ArrayDeque<String> fruits = new ArrayDeque<>();
        fruits.add("Lemon");
        fruits.addFirst("Orange");

        System.out.println(fruits);

        fruits.push("Kiwi");

        System.out.println(fruits);

        fruits.addLast("Apple");

        System.out.println(fruits);

        String first = fruits.getFirst();
        System.out.println(first);

        System.out.println("- - - - - - - -");

        // перебор используя peek
        while (fruits.peek() != null){
            System.out.println(fruits.pop());
        }
    }
}
