package lesson26.pizza_factory;

public class Hawaii extends Pizza {

    private static String TYPE = "Pizza Hawaii";

    public Hawaii() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with Pineapple.");
    }
}
