package lesson38_39.string_iterator;

import javax.sound.midi.Soundbank;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        String string = "Not iterable";

//        for(char ch : string){
//            System.out.println(ch);
//        }

        IterableString xStr = new IterableString("this is a test with for each");

        for(char ch : xStr){
            System.out.print(ch);
        }

        System.out.println();

        xStr = new IterableString("Print with our Iterator");
        Iterator<Character> ourIterator = xStr.iterator();

        while (ourIterator.hasNext()){
            System.out.print(ourIterator.next());
        }
    }
}
