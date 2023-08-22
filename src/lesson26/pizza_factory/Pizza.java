package lesson26.pizza_factory;

public abstract class Pizza {

    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void orderPizza(){
        prepare();
        back();
        pack();
        System.out.println("Have a nice Meal!");
    }

    protected abstract void prepare(); //protected - метод будет виден в дочерних классах

    private void back() {
        System.out.println("Backing " + type);
    }

    private void pack() {
        System.out.println("Packing " + type);
    }


}
