package lesson58.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class Transformer {
    /*
    Написать метод, принимающий строку, состоящую из слов, разделенных пробелом, и два функциональных интерфейса.
    - function and predicate.
    Метод должен предоставлять возможнотсь реализации следующих действий:
    1. При длине слова = 3, изменить все буквы этого слова на заглавные и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
     2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
     3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
      Слова состоят только из букв латинского алфавита
      Протестировать.
     */

    public static void main(String[] args) {
        Transformer transformer = new Transformer();

        String input = "aaa BBBB deF vbghR bbb";
        Predicate<String> predicate = str -> str.length()==3;
        Function<String,String> function = String::toUpperCase;
        System.out.println(transformer.transformString(input, predicate, function));

    }
    public String transformString(String input, Predicate<String> predicate, Function<String, String> function) {

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(predicate.test(words[i])){
                words[i] = function.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }



}
