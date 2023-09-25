package lesson50.type_conversion;

import java.io.FileInputStream;

public class Main {

    /*
    Type conversion - Преобразование типов

    Преобразование совместимых типов
    Автоматическое преобразование типов возможно при соблюдении двух условий:
    1. эти типы совместимы
    2. Тип, в который происходит преобразование - больше, чем тип, из которого происходит преобразование.
        Пример: преобразование из типа byte в тип int
        Такое преобразование называется расширяющим (widening)
     */

    public static void main(String[] args) {
        int i = 10;
        float f;
        System.out.println(i);
        f = i; // присвоение значения переменной целого типа - перемонной типа float
        System.out.println(f);

        Long lLong = 100123456L;
        double dDouble;
        dDouble = lLong;
        System.out.println(dDouble);

        dDouble = 100123456.0;
//        lLong = dDouble;

        /*
        Преобразование несовместимых типов (casting)

        (target-type) expression
         */

        double x, y;
        x = 100.23;
        y = 200.56;
        int res = (int) (x / y);
        System.out.println(res);

        int j = 100;
        byte b = (byte) j; //потеря информации не происходит так как байт может хранить число 100
        System.out.println("j = 100, b = " + b);

        j = 300;
        b = (byte) j; //потеря информации происходит так как 300 в байт не влезает
        System.out.println("j = 300, b = " + b);

        b = 89; // ASCII code for Y
        char ch = (char) b;
        System.out.println("ch = " + ch);

        // текстовый блок (с 15 джава) """ """

        String str = """
                aaaaaabbbbbbbbbbbbbbbbbbb.
                ccccccccccccccc!
                """;

        System.out.println(str);

        // c 10 java
        // var - variable
        /*
        в случае использования var, компилятор присваивает тип переменной по типу значения,
        которым она инициализирована, которое обязательно должно быть.
         */


        double average = 10.5;
        var average1 = 10.5;

        var a = 25; // вместо var будет заменено конкретным типом int
        int var = 25;// просто имя переменной

        var x1 = -var;
        System.out.println(x1);

        var ourArray = new int[10];
        // через var можно объявить только локальные переменные,
        // поля класса, параметры метода, тип возвращаемого метода - нельзя

        var string = "Hello java";
        var subStr = string.substring(1, 4);

        var ourClass = new OurClass(20);
        System.out.println(ourClass.getI());

//        var fileInputStream = new FileInputStream("in.txt");

        for (var k = 0; k < 5; k++) ;
        for(var v : ourArray);

        /*
        ограничения в использовании var:

        var anotherVar = null; - инициализировать с null нельзя
        var arr = {1,2,3}; - так тоже нельзя
        нельзя также использовать в качестве имени класа, интерфейса и тд,
        а также для начального значения в лямбда выражениях


         */

    }
}
