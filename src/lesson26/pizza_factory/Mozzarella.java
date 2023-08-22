package lesson26.pizza_factory;

public class Mozzarella extends Pizza {

    private static String TYPE = "Pizza Mozzarella";

    public Mozzarella() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with mozzarella chease.");
    }
}
