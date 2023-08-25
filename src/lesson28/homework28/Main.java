package lesson28.homework28;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape rectangle2 = new Rectangle(50, 40);
        Shape rectangle1 = new Rectangle(20, 30);
        Shape circle = new Circle(10);
        Shape circle1 = new Circle(20);
        Shape circle2 = new Circle(30);

        Shape[] shapes = {rectangle, rectangle1, rectangle2, circle, circle1, circle2};

        for (Shape shape : shapes) {
            System.out.println("Name of shape: " + shape.getName() + "; Perimeter: " + shape.calculatePerimeter() + "; Square: " + shape.calculateSquare());
        }
        System.out.println("========================");
        System.out.println("Sum of all squares: " + Shape.totalSquare(shapes));


    }
}
