package lesson34.accounting;

import java.util.Arrays;
import java.util.Comparator;

public class Company {

    private Employee[] employees;
    private int companySize;

    public Company(int capacity) {
        this.employees = new Employee[capacity];
        companySize = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (companySize < employees.length) {
            employees[companySize] = employee;
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee) {
        for (int i = 0; i < companySize; i++) {
            if (employees[i].equals(employee)) {
                employees[i] = employees[companySize - 1];
                companySize--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("Employees of the Company:");
        for (int i = 0; i < companySize; i++) {
            System.out.println(employees[i]);
        }
    }

    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < companySize; i++) {
            totalSalary += employees[i].calculateSalary();
        }
        return totalSalary;
    }

    public void sortEmployees() {
//        Employee[] sortedEmployees = new Employee[companySize];
//
//        for (int i = 0; i < companySize; i++) {
//            sortedEmployees[i] = employees[i];
//        }
//        Arrays.sort(sortedEmployees);
//        System.out.println(Arrays.toString(sortedEmployees));

        Arrays.sort(employees, 0, companySize);
    }

    public void sortEmployeesByID() {
        Arrays.sort(employees, 0, companySize, new IdComparator());
    }

    public void sortEmployeesByIDwithAnonym() {
        Arrays.sort(employees, 0, companySize, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }

    public void sortEmployeesByNameThenId() {
        Arrays.sort(employees, 0, companySize, new NameIdComparator());
    }
}
