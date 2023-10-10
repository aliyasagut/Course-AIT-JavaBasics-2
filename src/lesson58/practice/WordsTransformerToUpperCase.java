package lesson58.practice;

public class WordsTransformerToUpperCase extends WordsTransformer {

    @Override
    public boolean check(String input) {
        return input.length() == 3;
    }

    @Override
    public String transform(String string) {
        return string.toUpperCase();
    }
}
