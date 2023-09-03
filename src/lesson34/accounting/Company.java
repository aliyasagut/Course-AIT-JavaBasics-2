package lesson34.accounting;

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
}
