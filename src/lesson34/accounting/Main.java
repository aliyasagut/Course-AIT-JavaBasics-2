package lesson34.accounting;

import java.util.Arrays;

public class Main {
    /*
    Написать программу для бухгалтерии.
    Программа должна уметь:
    - добавлять сотрудников в штат
    - удалять сотрудников из штата
    - должна уметь расчитывать зарплату для двух категорий сотрудников:
                1. сотрудник с почасовой оплатой
                2. менеджер по продажам

    У программы должны быть следующие классы:
    - Company, в котором содержатся методы для добавления сотрудника, удаления,
      вывода на экран списка всех сотрудников, метод для суммирования зарплат всех сотрудников
    - классы сотрудников:
        - abstract Employee
        - WageEmployee
        - SalesManager
        У сотрудников должны быть поля: id, name, surname, workingHours. Также должен быть метод подсчета зарплаты.
        У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
        минимальный размер оплаты труда.
        У менеджера по продажам нет фиксированной оплаты. Его зп рассчитывается как процент от объема продаж. Но его
        метод оплаты тоже должен учитывать мин размер оплаты труда.

        Дополнительно:
        Программа также должна содержать методы предоставляющие возмость сортировки списка сотрудников по следующим
        критериям:
            - по фамилии
            - по id
            - по имени, а если имена одинковые, то по id
     */
    public static void main(String[] args) {
        Employee employee1 = new WageEmployee("Harry", "Potter", 40.0, 15);
        Employee employee2 = new WageEmployee("Ron", "Weasley", 35.0, 12);
        Employee employee3 = new SalesManager("Hermione", "Granger", 30.5, 100.6, 0.1);
        Employee employee4 = new SalesManager("Nevile", "Longbottom", 25.5, 200.6, 0.13);
        Employee employee5 = new SalesManager("Mary", "Brown", 85, 110000, 0.5);
        Employee employee6 = new WageEmployee("Harry", "While", 60, 12);

        Company company = new Company(6);
        System.out.println("Add new employee: " + company.addEmployee(employee1));
        System.out.println();
        company.display();

        System.out.println(company.addEmployee(employee2));
        System.out.println(company.addEmployee(employee3));
        System.out.println(company.addEmployee(employee4));
        System.out.println(company.addEmployee(employee5));
        System.out.println(company.addEmployee(employee6)); //true
        System.out.println(company.addEmployee(employee1)); //false

        System.out.println();
        company.display();

        System.out.println("\nRemove employee: " + company.removeEmployee(employee3));
        System.out.println();
        company.display();

        System.out.println("\nTotal salary of all employees: " + company.totalSalary());


        System.out.println("\n-----To String-----");
        Employee[] employees = {employee1, employee2, employee3, employee4};
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println("\n----Calculate salary-----");
        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getFirstName() + " " + employee.getLastName() +
                    " has following salary: " + employee.calculateSalary());
        }

        System.out.println("\n-----Sort by Second name------");
        company.sortEmployees();
        company.display();

        System.out.println("\n-----Sort by ID------");
//        company.sortEmployeesByID();
        company.sortEmployeesByIDwithAnonym();
        company.display();

        System.out.println("\n-----Sort by first name and id------");
        company.sortEmployeesByNameThenId();
        company.display();

    }
}
