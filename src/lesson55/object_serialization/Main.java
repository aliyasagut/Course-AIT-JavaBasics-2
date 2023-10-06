package lesson55.object_serialization;

import lesson54.practice.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Сериализация - это преевращение объекта в поток байтов для записи в файл, передачи по сети, записи в базу данных
    /*
    Десериализация - наоборот, восстановление обекта из потока байтов.
    Сериализовать можно объекты класса реализующего интерфейс Serializable.
    Этот интерфейс не определяет никаких методов, а служит маркером(указателем), что объект может быть сериализованным.

    для сериализации используется класс ObjectOutputStream

    конструктор:
    ObjectOutputStream(OutputStream output)

    void writeObject (Object object)

     */

    public static void main(String[] args) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Employee employee = new Employee("John", 35, 5000.0, true);
            outputStream.writeObject(employee);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error occurred");
        }

        // Для десериализаци используется класс ObjectInputStream
        /*
        ObjectInputStream(InputStream input)
        Object readObject()
         */

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Employee employee = (Employee) inputStream.readObject();
            System.out.println("Name: " + employee.name + ", age: " + employee.age + ", salary: " + employee.salary +
                    ", Manager? " + employee.isManager);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50, 2000.0, false));
        employees.add(new Employee("Ann", 25, 5000.0, true));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {

            outputStream.writeObject(employees);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // deserialization

        List<Employee> newEmployees = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            newEmployees = (ArrayList<Employee>) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Employee employee:newEmployees){
            System.out.println(employee.name);
            System.out.println(employee.age);
            System.out.println(employee.salary);
            System.out.println(employee.isManager);
        }


    }// end main
}



