package structural.composite.real;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class Employee {
    private String name;
    List<Employee> subordinates = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
