package org.example.factory;

// Factory class for creating Employee objects
public class EmployeeFactory {

    // Factory method to create a Manager
    public static Employee createManager(String name) {
        return new Employee(name, "Manager", 100_000_000);
    }

    // Factory method to create a Staff member
    public static Employee createStaff(String name) {
        return new Employee(name, "Staff", 50_000_000);
    }
}
