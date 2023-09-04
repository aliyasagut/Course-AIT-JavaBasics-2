package lesson33.animals;

import java.util.Comparator;

public interface AnimalComparatorInterface extends Comparator<Animal> {

    int compare (Animal a1, Animal a2);
}
