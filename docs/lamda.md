## Lambda expressions and Functional Interfaces
lesson 35

Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы.

Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет тело лямбда-выражения, где выполняются все действия.

Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.

Лямбда выражения - эфо форма анонимного класса, анонимный метод без названия.
Лямбда выражения связаны с функциональными интерфейсами.

Функц. интерфейс - это интерфейс с одним абстрактным методом.

## Синтаксис:
- пааметры -> тело лямбда выражения
- parameters -> lambda body

## Без параметров:
- () -> 100.0;
- () -> Math.random() * 1000;
        
## C параметрами:
- (n) -> 2.0/n;
- (n) -> (n % 2)==0; возващет булеан
- n -> 1/n;

## Примеры

@FunctionalInterface
```sh
public interface OurTestInterface {

    boolean test(int n, int m);
}
```
@FunctionalInterface
```sh
public interface StringTestInterface {

    boolean test (String str1, String str2);
}
```
Main
```sh
public static void main(String[] args) {
OurTestInterface isDevided = (a, b) -> (a % b) == 0;
System.out.println("A is devided by b without remainder? " + isDevided.test(10, 2));

OurTestInterface isMore = (a, b) -> a > b;
System.out.println("Is A more than B? " + isMore.test(10, 2));

OurTestInterface isEqual = (a, b) -> a == b;
System.out.println("A = B ? " + isEqual.test(10, 2));

StringTestInterface isPart = (str1, str2) -> str1.indexOf(str2) != -1;
String str1 = "This is a test";
System.out.println("Is string2 a prt of string1 ? " + isPart.test(str1, "is"));

StringTestInterface isEqualStr = (a, b) -> a.equals(b);
System.out.println(isEqualStr.test("qwerty", "qwertz"));
}
```
@FunctionalInterface
```sh
public interface NumericInterface {

    int method1 (int n);
}
```
Main
```sh
NumericInterface smallDevidor = n -> {

            int res = 1;
            n = n < 0 ? -n : n;

            for (int i = 2; i <= n; i++) {
                if ((n % i) == 0){
                    res = i;
                    break;
                }
            }
            return res;
        };
```
