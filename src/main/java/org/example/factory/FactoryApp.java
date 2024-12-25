package org.example.factory;

// Main application to demonstrate the Factory Pattern
public class FactoryApp {
    public static void main(String[] args) {
        // Demonstrating Employee Factory
        // Factory methods are used to create employees with predefined roles and salaries
        Employee manager1 = EmployeeFactory.createManager("Eko");
        Employee manager2 = EmployeeFactory.createManager("Budi");
        Employee staff1 = EmployeeFactory.createStaff("Joko");
        Employee staff2 = EmployeeFactory.createStaff("Tono");

        // Display the created employees
        System.out.println(manager1);
        System.out.println(manager2);
        System.out.println(staff1);
        System.out.println(staff2);

        // Demonstrating Animal Factory
        // Factory methods are used to create animals based on type
        Animal tiger = AnimalFactory.createAnimal("tiger");
        Animal cat = AnimalFactory.createAnimal("cat");
        Animal dog = AnimalFactory.createAnimal("dog");

        // Display the sound of each animal
        System.out.println("Tiger sound: " + tiger.makeSound());
        System.out.println("Cat sound: " + cat.makeSound());
        System.out.println("Dog sound: " + dog.makeSound());
    }
}
