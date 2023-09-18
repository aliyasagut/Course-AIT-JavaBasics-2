package lesson45.map_merge;

import java.util.HashMap;

public class Main {
    // метод merge()
    /*
    Map hashmap = new HashMap()

    hashmap.merge(key, value, remappingFunction)

    параметры:
    key - ключ, по которому нужно положить значение value
    value - само значение, связанное с ключом key
    remappingFunction - третий параметр будет использован, если ключ key уже существует

    Метод добавляет значение value по ключу key, если такого ключа в мапе нет.
    А если есть, то в третьем параметре (remapping function) оределяется, какое будет новое значение value.

     */

    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();

        prices.put("Laptop", 1000);
        prices.put("TV", 500);
        prices.put("Mouse", 20);

        System.out.println(prices);

        prices.merge("Mobile", 300, (oldValue, newvalue) -> oldValue + newvalue);
        System.out.println(prices);

        prices.merge("Mobile", 100, (oldValue, newvalue) -> oldValue + newvalue);
        System.out.println(prices);

        prices.merge("Laptop", 500, (oldValue, newvalue) -> oldValue + newvalue);
        System.out.println(prices);

        HashMap<String, String> cities = new HashMap<>();
        cities.put("Berlin", "Germany");
        cities.put("Muenchen", "Germany");
        cities.put("Stutgart", "Germany");
        cities.put("London", "England");
        cities.put("Paris", "Franced");

        System.out.println("Capitals: ");
        System.out.println(cities);

        cities.merge("London", "GreatBritain", (oldvalue, newvalue) -> oldvalue + "/" + newvalue);
        cities.merge("Rome", "Italy", (oldvalue, newvalue) -> oldvalue + "/" + newvalue);

        System.out.println("cities changed: ");
        System.out.println(cities);

        System.out.println("--------------------------------------------");
        HashMap<String, Integer> prices1 = new HashMap<>();
        prices1.put("Notebook", 500);
        prices1.put("Scanner", 350);

        HashMap<String, Integer> prices2 = new HashMap<>();
        prices2.put("TV", 700);
        prices2.put("Scanner", 310);

        prices2.forEach((key, value) -> prices1.merge(key, value, (oldValue, newValue) -> {
            if(oldValue<newValue){
                return oldValue;
            } else {
                return newValue;
            }
        }));

        System.out.println("Merged map:");
        prices1.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }
}
