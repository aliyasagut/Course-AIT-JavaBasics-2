package lesson59.our_optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main_optional {
    /*
    Class Optional

    - предоставляет возможности при обработке значений null.
    Создание объекта класса
     */
    public static void main(String[] args) {
        // пустой контейнер
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        // создание не пустого объекта
        String name = "John";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.isPresent());

        String nullStr = null;
//        System.out.println(Optional.of(nullStr)); // nullPointerException

//        Optional<String> optNull = Optional.of(nullStr);
//        System.out.println(optNull.isPresent()); // nullPointerException

        Optional<String> optNull2 = Optional.ofNullable(nullStr);
        System.out.println(optNull2.isPresent()); // false

        // method isPresent() используется для проверки наличия внутри объекта Optional значений
        // Если есть, возвращает true и  false, если нет

        // метод boolean ifPresent() - если присутствует

        if (name != null) {
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("java");
        optional.ifPresent(str -> System.out.println(str.length()));

        // методы получения значения из Optional
        // orElse() - позволяет получить значение, которое находится в Optional или задать дефолтное, если его там нет

//        String nullName = null;
        String nullName = "John";
        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        // orElseGet()
        nullName = null;
        String anotherNme = Optional.ofNullable(nullName).orElseGet(() -> "Kate");
        System.out.println(anotherNme);

        //orElseThrow() - кидает exception если null
//        String nameEx = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
//        String nameEx = Optional.ofNullable(nullName).orElseThrow();

        // get()
        Optional<String> newWord = Optional.of("Hello");
        String hello = newWord.get();
        System.out.println(hello);

        Optional<String> newWordNull = Optional.ofNullable(null);
//        newWordNull.get(); // будет exception




    }// end main
}




