package lesson59.homework;

public class Address {
    String street;
    int houseNr;

    public Address(String street, int houseNr) {
        this.street = street;
        this.houseNr = houseNr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNr=" + houseNr +
                '}';
    }
}
