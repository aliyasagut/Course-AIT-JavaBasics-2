package lesson29.cars;

public class PassengerCar extends Car {

    public PassengerCar(String model, String manufacture,
                        int year, String color) {
        super(model, manufacture, year, color);
    }

    @Override
    public void move() {
        System.out.println("Car " + super.getModel() + " is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car " + super.getModel() + " is stopping");
    }

    public String toString(){
        return "Passenger Car{} " + super.toString();
    }


}
