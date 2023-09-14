package lesson42.our_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Product> productsByName = new HashMap<>();

        Product computer = new Product("Computer", "Computer can calculate fast");
        Product tv = new Product("TV", "TV can show shows and films");
        Product printer = new Product("Printer", "Printer can print something");

        productsByName.put(computer.getName(), computer);
        productsByName.put(tv.getName(), tv);
        productsByName.put(printer.getName(), printer);

        System.out.println(productsByName);

        Product product = productsByName.get("Printer");
        System.out.println(product);
        System.out.println(productsByName.get("Mouse"));

        Product mouse = new Product("Mouse", "This is a mouse");
        productsByName.put("Printer", mouse);

        System.out.println(productsByName);

        productsByName.remove("Printer");
        System.out.println(productsByName);

        System.out.println(productsByName.containsKey("Printer"));
        System.out.println(productsByName.containsKey("TV"));

        System.out.println(productsByName.containsValue(tv));

        productsByName.put("Mouse", mouse);
        productsByName.put("Printer", printer);
        System.out.println(productsByName);

        // Перебор элементов в мапе

        System.out.println(productsByName.keySet());

        System.out.println("------- 1 Method: Print by KeySet -------");
        for (String key : productsByName.keySet()) {
            Product p = productsByName.get(key);
            System.out.println(key + ":" + p);
        }

        System.out.println("------- 2 Method: Print by EntrySet -------");
        for (Map.Entry<String, Product> entry : productsByName.entrySet()) {
            String key = entry.getKey();
            Product p = entry.getValue();
            System.out.println(key + ":" + p);
        }

        System.out.println("------- 3 Method: Print with forEach() -------");
        productsByName.forEach((key, value) -> System.out.println(key + ":" + value));

        // получить список значений с помощью метода values()
        System.out.println("------- Values List -------");
        List<Product> products = new ArrayList<>(productsByName.values());
        System.out.println(products);

        // getOrDefault() - если ключ есть - возвращается значение, если ключа нет - возвращается дефолтное значение вместо null

        Product car = new Product("Car", "Car can drive");

        // with get() before java 8
        System.out.println("--------------------------- with get() ------------------");
        System.out.println(productsByName.containsKey("Computer") ? productsByName.get("Computer") : car);
        System.out.println(productsByName.containsKey("Computer1") ? productsByName.get("Computer") : car);

        // with getOrDefault()
        System.out.println("--------------------------with getOrDefault() ------------------");
        System.out.println(productsByName.getOrDefault("Car", car));

        // using Product as key
        System.out.println("---------------------------------------------------------------------");
        Map<Product, Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(computer, 1000);
        priceByProduct.put(tv, 600);
        priceByProduct.put(printer, 200);

        System.out.println(priceByProduct);

    }
}
