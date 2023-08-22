package lesson26.pizza_factory;

public class Salami extends Pizza {

    private static String TYPE = "Pizza Salami";

    public Salami() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with Salami.");

    }
}
