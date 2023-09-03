package lesson34.accounting;

import javax.swing.plaf.nimbus.State;

public class WageEmployee extends Employee {

    private double wage;

    public WageEmployee(String firstName, String lastName, double workingHours, double wage) {
        super(firstName, lastName, workingHours);
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        double salary = getWorkingHours() * wage;
        if (salary <= getWorkingHours() * StateConstants.MIN_WAGE) {
            salary = getWorkingHours() * StateConstants.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}' + super.toString();
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

}
