package lesson61.custom_collector;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    /*
    Пусть есть класс Employee
    String name
    int salary
    Написать свой коллектор, расчитывающий суммарную зп всех сотрудников
     */
    public static void main(String[] args) {

        Employee a1 = new Employee("John", 1500);
        Employee a2 = new Employee("John2", 1700);
        Employee a3 = new Employee("John3", 2200);
        Employee a4 = new Employee("John4", 1000);

        Supplier<Box> supp = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box, Employee> accumulator = (result, employee) -> {
            result.setValue(result.getValue() + employee.getSalary());
            System.out.println(result.getValue() + " " + employee.getName());
        };

        BinaryOperator<Box> combiner = (res1, res2) -> {
            System.out.println("Combining results");
            res1.setValue(res1.getValue() + res2.getValue());
            return res1;
        };

        // T,A,R
        Collector<Employee, Box, Box> salaryCollector = Collector.of(supp, accumulator, combiner);

        Box box = Stream.of(a1, a2, a3, a4)
                .parallel()
                .collect(salaryCollector);

        System.out.println("-----------------");
        System.out.println("Total salary " + box.toString());

    }
}
