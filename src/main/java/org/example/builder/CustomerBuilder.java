package org.example.builder;

/**
 * Builder class for constructing instances of the Customer class.
 * This demonstrates the Builder pattern, useful for creating objects with many optional parameters.
 */
public class CustomerBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private int age;

    // Public constructor to initialize the builder.
    public CustomerBuilder () {}

    public CustomerBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * Builds and returns a Customer instance using the data provided.
     */
    public Customer build() {
        return new Customer(
                id,
                firstName,
                lastName,
                email,
                phone,
                address,
                age
        );
    }
}
