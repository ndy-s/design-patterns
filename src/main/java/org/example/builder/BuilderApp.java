package org.example.builder;

public class BuilderApp {
    public static void main(String[] args) {
        // Using the builder to create a Customer object.
        Customer customer = new CustomerBuilder()
                .setId("C001")
                .setFirstName("John")
                .setLastName("Doe")
                .setEmail("john.doe@example.com")
                .setPhone("123456789")
                .setAddress("123 Elm Street")
                .setAge(30)
                .build();

        // Output the created customer details.
        System.out.println("Customer Details:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Age: " + customer.getAge());
    }
}
