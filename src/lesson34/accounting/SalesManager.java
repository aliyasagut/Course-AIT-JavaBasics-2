package lesson34.accounting;

public class SalesManager extends Employee {

    private double salesVolume;
    private double percent;

    public SalesManager(String firstName, String lastName, double workingHours, double salesVolume, double percent) {
        super(firstName, lastName, workingHours);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    @Override
    public double calculateSalary() {
        double salary = salesVolume * percent;
        if (salary < super.getWorkingHours() * StateConstants.MIN_WAGE){
            salary = super.getWorkingHours() * StateConstants.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "salesVolume=" + salesVolume +
                ", percent=" + percent +
                '}' + super.toString();
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public double getPercent() {
        return percent;
    }

    public void setSalesVolume(double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
