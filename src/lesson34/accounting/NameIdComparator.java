package lesson34.accounting;

import java.util.Comparator;

public class NameIdComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        if (e1.getFirstName().equals(e2.getFirstName())) {
            return Integer.compare(e1.getId(), e2.getId());
        } else {
            return e1.getFirstName().compareTo(e2.getFirstName());
        }
    }
}
