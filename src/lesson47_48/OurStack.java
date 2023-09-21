package lesson47_48;

import java.util.Stack;

public class OurStack {
    //Stack - стэк - структура данных, основанная на принципе LIFO (Last in - first out)
    /*
    конструктор:

    методы:
    empty()
     */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // empty() -> boolean
        System.out.println(stack.empty());

        // push() - adds element on the top of stack
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");

        System.out.println(stack);

        // pop() - removes and returns top element, returns exception, if there is no elements
        System.out.println(stack.pop());
        System.out.println(stack);

        // peek() - get and returns top element without deleting
        System.out.println(stack.peek());
        System.out.println(stack);


    }

}
