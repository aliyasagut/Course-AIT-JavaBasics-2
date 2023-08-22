package lesson26.pizza_factory;

public class PizzaFactory {
    public static void placeOrderOfPizza(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("You've successfully ordered Pizza Hawaii!");
                Hawaii hawaii = new Hawaii();
                hawaii.orderPizza();
                break;
            }
            case 2: {
                System.out.println("You've successfully ordered Pizza Salami");
                Salami salami = new Salami();
                salami.orderPizza();
                break;
            }
            case 3: {
                System.out.println("You've successfully ordered Pizza Mozzarella");
                Mozzarella mozzarella = new Mozzarella();
                mozzarella.orderPizza();
                break;
            }
            default: {
                System.out.println("Please choose your Pizza: 1 - Hawaii, 2 - Salami, 3 - Mozzarella");
            }
        }
    }
}
