package lesson47_48.java_exceptions;

public class NonIntegerException extends Exception {

    int n;
    int d;

    public NonIntegerException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString(){
        return "Result of division " + n + " and " + d + " is not an integer.";
    }
}
