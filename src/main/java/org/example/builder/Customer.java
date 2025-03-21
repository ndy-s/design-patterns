package org.example.builder;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private int age;

    public Customer (String id, String firstName, String lastName, String email, String phone, String address, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
