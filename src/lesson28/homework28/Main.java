package lesson28.homework28;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape rectangle2 = new Rectangle(10, 20);
        Shape rectangle1 = new Rectangle(5, 15);
        Shape circle = new Circle(10);
        Shape circle1 = new Circle(14);

        Shape[] shapes = {rectangle, rectangle1, rectangle2, circle, circle1};

        for (Shape shape : shapes) {
            System.out.println("Name of shape: " + shape.getName() + "; Perimeter: " + shape.calculatePerimeter() + "; Square: " + shape.calculateSquare());
        }
        System.out.println("========================");
        System.out.println("Sum of all squares: " + Shape.totalSquare(shapes));


    }
}
