package lesson33.animals;

import java.util.Comparator;

public class WeightComparator implements Comparator<Animal> {

    public int compare(Animal a1, Animal a2){
        return Integer.compare(a1.weight, a2.weight);
    }
}
