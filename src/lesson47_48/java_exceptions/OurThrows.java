package lesson47_48.java_exceptions;

import lesson28.interfaces2.A;

import java.io.IOException;

public class OurThrows {
    /*
    throws
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        try {
            example();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


        example1(1);
    }

    public static void example() throws ArithmeticException, NullPointerException {

        System.out.println(2 / 0);

        String nullStr = null;
        nullStr.length();
    }

    public static void example1(int num) throws IOException, ClassNotFoundException{
        if(num == 1){
            throw new IOException("IO Exceptions occurred");
        } else {
            throw new ClassNotFoundException("Class not found");
        }
    }
}
