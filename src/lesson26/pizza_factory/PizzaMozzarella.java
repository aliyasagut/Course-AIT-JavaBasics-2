package lesson26.pizza_factory;

public class PizzaMozzarella extends Pizza {

    private static String TYPE = "Pizza Mozzarella";

    public PizzaMozzarella() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with mozzarella chease.");
    }
}
