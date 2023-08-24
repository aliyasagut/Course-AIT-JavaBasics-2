package lesson28.homework28;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.name = "Rectangle";
    }


    @Override
    public double calculateSquare() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }
}
