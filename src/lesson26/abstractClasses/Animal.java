package lesson26.abstractClasses;

public abstract class Animal { // абстрактные методы могут присутствовать только в абстрактных классах

    public abstract void sound (); // абстрактный метод - это метод без тела

    public void move(){
        System.out.println("Every animal can move");
    }
}
