package lesson32.homework32;

public abstract class Shape implements ShapeInterface {
    String name;

    public String getName() {
        return name;
    }

    static double totalSquare(Shape[] shapes) {
        double sumOfSquares = 0;
        for (Shape shape : shapes) {
            sumOfSquares += shape.calculateSquare();
        }
        return sumOfSquares;
    }

}
