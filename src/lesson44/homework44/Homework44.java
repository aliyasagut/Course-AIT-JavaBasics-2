package lesson44.homework44;

import java.util.*;

public class Homework44 {
    /*
    Есть класс автомобиль, в котором есть три поля: марка, модель, цена.
    Написать метод, котрый принимает лист автомобилей и возвращает TreeMap,
    ключами являются марки автомобили, а значениями - TreeSet автомобилей, в котором автомобили расположены в
    лексико-графическом порядке относительно модели, причем дешевые вперед, если модели одинаковые

    BMW
    make BMW
    model BMWModel1
    price 100_000

    make BMW
    model BMWModel2
    price 150_000

    BMW = [ {make = BMW, model = BMWModel1, price = 100_000}, {make = BMW, model = BMWModel2, price = 150_000} ]


     */
    public static void main(String[] args) {
        Auto bmw1 = new Auto("BMW", "model1", 100_000);
        Auto bmw4 = new Auto("BMW", "model1", 120_000);
        Auto bmw2 = new Auto("BMW", "Amodel2", 150_000);
        Auto bmw3 = new Auto("BMW", "model3", 210_000);
        Auto vw1 = new Auto("VW", "model4", 110_000);
        Auto vw2 = new Auto("VW", "Bmodel4", 110_000);

        List<Auto> autos = List.of(bmw1, bmw2, bmw3, vw1);
        System.out.println(autos.toString());


    }

    public Map<String, Set<Auto>> autoByMake(List<Auto> autos) {
        Map<String, Set<Auto>> autoByMake = new TreeMap<>();

        for (Auto auto : autos) {
            if (autoByMake.containsKey(auto.getMake())) {
                Set<Auto> value = autoByMake.get(auto.getMake());
                value.add(auto);
                autoByMake.put(auto.getMake(), value);
            } else {
                Set<Auto> value = new TreeSet<>();
                value.add(auto);
                autoByMake.put(auto.getMake(), value);
            }
        }
        return autoByMake;
    }
}
