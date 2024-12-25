package org.example.factory;

// Class representing an Employee with specific attributes
public class Employee {
    private final String name;
    private final String position;
    private final double salary;

    // Constructor to initialize Employee attributes
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Override toString method for better representation of Employee objects
    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + "}";
    }
}
