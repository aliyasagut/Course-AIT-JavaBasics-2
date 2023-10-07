package lesson56.lambdas;


// Все методы интерфейса по умолчанию public
// функциональный интерфейс - этой интерфейс с одним методом
//@FunctionalInterface - аннотация к функциональному интерфейсу
// для того чтобы реализовать метод интерффейса через лямбда выражения, интерфейс должен быть функциональным
@FunctionalInterface
public interface Flyable {

    void fly();
//    void fly1();
}