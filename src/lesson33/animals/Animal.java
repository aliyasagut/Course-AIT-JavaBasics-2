package lesson33.animals;

public class Animal implements Comparable<Animal>{
    String name;
    int weight;
    String color;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Animal animal) {
        return getName().compareTo(animal.getName());
    }

    @Override
    public String toString() {
        return "Animal " +
                "name " + name +
                ", weight " + weight +
                ", color " + color + ", ";
    }
}
