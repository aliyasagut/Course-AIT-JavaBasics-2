package lesson33.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMainTest {

    Animal wolf = new Animal("wolf", 12, "grey");
    Animal bear = new Animal("bear", 30, "braun");
    Animal fox = new Animal("fox", 10, "red");
    Animal elephant = new Animal("elephant", 100, "grey");
    Animal anakonda = new Animal("anakonda", 5, "yellow");

    Animal[] animals = {wolf, bear, fox, elephant, anakonda};

    @Test
    void testComparatorByWeight() {
        WeightComparator weightComparator = new WeightComparator();

        assertFalse(weightComparator.compare(wolf, bear) > 0);
    }

    @Test
    void testComparatorLastLetter() {
        LastLetterComparator lastLetterComparator = new LastLetterComparator();

        assertFalse(lastLetterComparator.compare(wolf, bear) > 0);
    }

}