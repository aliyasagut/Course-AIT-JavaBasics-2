package lesson29.cars;

public abstract class Car implements Movable {
    private String model;
    private String manufacture;
    private int year;
    private String colour;

    public Car(String model, String manufacture, int year, String color) {
        this.model = model;
        this.manufacture = manufacture;
        this.year = year;
        this.colour = color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }
}
