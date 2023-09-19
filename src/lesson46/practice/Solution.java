package lesson46.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    /*
    Есть массив принимающий три вида скобок, а именно: ( ,) ,[ ,], {, }.
    Нужно написать метод, определяющий является ли порядок скобок в массиве корректным
    {}([]) - correct
    {}([]{()}) - correct
    {(] - not correct
    {}([])} - not correct
    {}([])( - not correct
    {(}) - not correct

    Использовать deque при решении
     */

    public boolean areBracketsCorrects(char[] brackets) {

        if (brackets.length % 2 != 0) {
            return false;
        }

        Deque<Character> deque = new ArrayDeque<>();

        for (char bracket : brackets) {
            if (bracket == '{' || bracket == '(' || bracket == '[') {
                deque.addLast(bracket);
            } else if (deque.size() > 0) {
                char lastOpenBracket = deque.getLast();

                if (bracket == '}' && lastOpenBracket == '{' ||
                        bracket == ')' && lastOpenBracket == '(' ||
                        bracket == ']' && lastOpenBracket == '[') {
                    deque.removeLast();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        char[] chars1 = {'{', '}', '(', '[', ']', ')'};
        System.out.println(solution.areBracketsCorrects(chars1));

        char[] chars2 = {'{', '(', ']'};
        System.out.println(solution.areBracketsCorrects(chars2));
    }
}
