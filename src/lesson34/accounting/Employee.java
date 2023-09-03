package lesson34.accounting;

public abstract class Employee implements Comparable<Employee>{

    private int id;
    private String firstName;
    private String lastName;
    private double workingHours;
    private static int counter = 1;

    public Employee(String name, String surname, double workingHours) {
        this.id = counter++;
        this.firstName = name;
        this.lastName = surname;
        this.workingHours = workingHours;
    }

    public abstract double calculateSalary();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "id=" + id +
                ", name ='" + firstName + '\'' +
                ", surname ='" + lastName + '\'' +
                ", workingHours =" + workingHours +
                '}';
    }

    public int compareTo( Employee e){
        return getLastName().compareTo(e.getLastName());
    }
}
