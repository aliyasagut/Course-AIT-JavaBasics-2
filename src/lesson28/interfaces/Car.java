package lesson28.interfaces;

public class Car implements Movable, Breakable{

    @Override
    public void canMove() {
        System.out.println("a car can drive");
    }

    public void canBreak(){
        System.out.println("a car can break");
    }

}
