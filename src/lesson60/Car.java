package lesson60;

public class Car {
    private String Brand;
    private int price;

    public Car(String brand, int price) {
        Brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return price;
    }
}
