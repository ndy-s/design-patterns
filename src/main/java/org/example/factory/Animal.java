package org.example.factory;

// Abstract class representing the general concept of an Animal
public abstract class Animal {
    public abstract String makeSound();
}

// Concrete subclass representing a Tiger
class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Roar!";
    }
}

// Concrete subclass representing a Cat
class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
}

// Concrete subclass representing a Dog
class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Bark!";
    }
}
