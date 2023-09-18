package lesson44.homework44;

public class Auto implements Comparable<Auto>{

    private String make;
    private String model;
    private int price;

    public Auto(String make, String model, int price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Auto auto) {
        int flag = this.model.compareTo(auto.model);
        if (flag == 0){
            flag = Integer.compare(this.price, auto.price);
        }
        return flag;
    }

}
