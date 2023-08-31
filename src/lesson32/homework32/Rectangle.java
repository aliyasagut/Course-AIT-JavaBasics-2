package lesson32.homework32;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int a, int b) {
        this.length = a;
        this.width = b;
        this.name = "Rectangle";
    }


    @Override
    public double calculateSquare() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
