package lesson31.wrapper_classes_and_generics;

public class Printer {

    public <T> void printArray(T[] values){
        for (T value : values){
            System.out.print(values + " ");
        }
    }

}
