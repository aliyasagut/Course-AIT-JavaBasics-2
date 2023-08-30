package lesson31.wrapper_classes_and_generics;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = new Person("John2", "twenty five");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
