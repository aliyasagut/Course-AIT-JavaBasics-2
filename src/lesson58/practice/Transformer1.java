package lesson58.practice;

public class Transformer1 {
     /*
      2. Дана строка, состоящая из слов, разделенных пробелом. Написать метод, позволяющий изменять слова в строке
      таким образом:
     1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
     2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
     3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
      Слова состоят только из букв латинского алфавита
      Использовать свойства наследования классов
      Протестировать.

      3. тоже самое, но на  интерфейсах

     */
     public static void main(String[] args) {
         String input = "aaa BBBB deF vbghR bbb";
         System.out.println(transformString1(input, new WordsTransformerToUpperCase()));
         System.out.println(transformString1(input, new WordsTransformerLowerCase()));
         System.out.println(transformString1(input, new WordsTransformStars()));
     }

    public static String transformString1(String input, WordsTransformer t) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(t.check(words[i])){
                words[i] = t.transform(words[i]);
            }
        }
        return String.join(" ", words);
    }

}
