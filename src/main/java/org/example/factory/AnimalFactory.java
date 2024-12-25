package org.example.factory;

// Factory class responsible for creating Animal objects
public class AnimalFactory {

    // Factory method to create an Animal based on the type
    public static Animal createAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "tiger" -> new Tiger();
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> throw new IllegalArgumentException("Unknown animal type: " + type);
        };
    }
}
