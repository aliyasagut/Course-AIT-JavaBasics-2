package lesson40.equals_hashcode;

import java.util.Objects;

public class Order {
    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Order)) return false;
//
//        Order order = (Order) obj;
//
//        return this.id == order.id && this.name.equals(order.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id == order.id && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash * id + name.hashCode();

        return hash;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
