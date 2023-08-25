package lesson29.cars;

public class Truck extends Car {

    private int maxWeight;
    private int currentWeight = 0;
    private int maxFuel;
    private int currentFuel = 0;

    public Truck(String model, String manufacture,
                 int year, String color,
                 int maxWeight, int maxFuel) {
        super(model, manufacture, year, color);
        this.maxFuel = maxFuel;
        this.maxWeight = maxWeight;
    }

    public void load(int weight) {
        if (weight > getRemainingCapacity()) {
            System.out.println("This is too heavy for me! Can't continue.");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;

        System.out.println("Loading " + weight + " tons.........");
        System.out.println("Loaded " + weight + " tons.");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }
        if (unloadingWeight < 0) {
            System.out.println("Can't load negative weight");
            return;
        }
        currentWeight -= unloadingWeight;
        System.out.println("Unloading " + unloadingWeight + " tons...........");
        System.out.println("Unloaded " + unloadingWeight + " tons.");
        printRemainingCargo();
    }

    private int getRemainingCapacity(){
        return maxWeight-currentWeight;
    }

    private void printRemainingCapacity(){
        System.out.println("Remaining Capacity " + getRemainingCapacity() + " tons.");
    }

    private void printRemainingCargo() {
        System.out.println("Remaining Cargo weight is " + currentWeight + " tons.");
    }

    @Override
    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough Fuel, can't drive");
            return;
        }
        if (currentWeight == 0) {
            System.out.println("Please load truck before driving");
            return;
        }
        System.out.println("Trying.....");
        System.out.println("Trying.....");
        System.out.println("Trying.....");
        System.out.println("Trying.....");
        System.out.println("Yeah, driving!!!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping.....");
        System.out.println("Stopping.....");
        System.out.println("Yeah! I've stopped!");
    }

    public void setCurrentFuel(int currentFuel) {
        if (currentFuel <= maxFuel)
            this.currentFuel = currentFuel;

        else
            System.out.println("My fuel tank is only " + maxFuel + " litres.");
    }

}
