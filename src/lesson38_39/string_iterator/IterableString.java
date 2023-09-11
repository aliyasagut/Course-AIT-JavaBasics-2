package lesson38_39.string_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableString implements Iterable<Character>, Iterator<Character> {

    private String str;
    private int count = 0;

    public IterableString(String str) {
        this.str = str;
    }

    public boolean hasNext() {
        if (count < str.length()) {
            return true;
        }
        return false;
    }

    public Character next() {
        if (count == str.length())
            throw new NoSuchElementException();

        count++;
        return str.charAt(count - 1);
    }

    public Iterator<Character> iterator() {
        return this;
    }


}
