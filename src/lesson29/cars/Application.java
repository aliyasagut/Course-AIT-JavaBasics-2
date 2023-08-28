package lesson29.cars;

public class Application {
    /*
    1. Создать класс Car, содержащий общие характеристики машин: model, manufacture, year, colour.
    2. Создать дочение классы: PassengerCar, Truck, расширяющие car
    3. Создать интерфейс Movable, содержащий методы move and stop
    4. Также создать класс Kangaroo
    5. Общее поведение всех этих классов должно характеризоваться методами move and stop
    6. Класс Truck должен иметь также свои дополнительные характеристики и поведение, важное для грузовика.
       А именно: макс.грузоподъемность и объем топливного бака.
       Поведение грузовика:
       - загружаться (load) и сообщать о превышении грузоподъемности, а также сообщать , сколько еще можно загрузить груза до полной гузоплдъемности.
       - разгружаться, сообшать в случае, если пытаются разгрузить больше чем его имеющийся груз или число отрицательное,
       а также должен сообщать о весе остающегося на борту груза.
       - в случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать.
       - уметь дозаправляться
     */
    public static void main(String[] args) {
        Movable kangaroo = new Kangaroo();
        System.out.println(kangaroo);

        Car passemgerCar = new PassengerCar("XC90", "Volvo", 2020, "Red");
        passemgerCar.move();

        Movable passengerCarMov = new PassengerCar("car", "Mercedes", 2021, "red");
        passemgerCar.move();
        passemgerCar.stop();

        Car truckCar = new Truck("Truck", "MAN", 2020, "black", 5000, 100);
        Truck truck = new Truck("SuperTruck", "Volvo", 2019, "yellow", 5000, 500);

        System.out.println(truck);

        truck.move();
        truck.load(2000);
        truck.move();
        truck.setCurrentFuel(200);
        truck.move();

        truck.stop();

        truck.load(4000);

        truck.unload(10000);

        truck.unload(1000);
    }
}
