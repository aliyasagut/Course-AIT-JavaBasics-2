package lesson28.homework28;

public class Circle extends Shape {
    private int radius;
    private static double PI = 3.14;


    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double calculateSquare() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
