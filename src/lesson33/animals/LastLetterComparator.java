package lesson33.animals;

import java.util.Comparator;

public class LastLetterComparator implements Comparator<Animal> {

    public int compare(Animal a1, Animal a2){

        char lastCharA1 = a1.name.charAt(a1.name.length()-1);
        char lastCharA2 = a2.name.charAt(a2.name.length()-1);
        return Character.compare(lastCharA1,lastCharA2);
    }
}
