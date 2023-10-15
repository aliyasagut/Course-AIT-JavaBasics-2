package lesson61.practice;

import lesson28.interfaces2.B;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    // another flatMap example
    /*
    flatMapToInt()
    flatMapToDouble()
    flatMapToLong()

    intStream(a,b)
     */

    public static void main(String[] args) {
        Stream.of(2,3,0,1,3)
                .flatMapToInt(i -> IntStream.range(0, i))
                .forEach(System.out::print);

        System.out.println("\n-----with map------");
        Stream.of(2,3,0,1,3)
                .map(i -> IntStream.range(0, i))
                .forEach(System.out::println);
    }


    /*
    1.
    Пусть есть классы Person1 и BankAccount.
    Написать метод, принимающий лист банковских счетов и возвращающий мапу, где person1 - key, лист его счетов - value
     */

    public static Map<Person1, List<BankAccount>> mapAccountsToPerson(List<BankAccount> bankAccounts){
        return bankAccounts
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getOwner));
    }

    /*
    2.
    Есть класс BankAccounts и нужно написать метод, принимающий лист BankAccounts и возвращающий лист IBANs со звездочками после третьего символа
    DE4************, DE5*************
     */

}
