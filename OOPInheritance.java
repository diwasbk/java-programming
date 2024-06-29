// Base class
class Animal {
    // Fields
    String name;
    int age;

    // Method to set name
    void setName(String name) {
        this.name = name;
    }

    // Method to set age
    void setAge(int age) {
        this.age = age;
    }

    // Method
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Dog
class Dog extends Animal {
    // Override method
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Override method
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

// Main class
public class OOPInheritance {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(3);

        Cat cat = new Cat();
        cat.setName("Whiskers");
        cat.setAge(2);

        // Display information and make sounds
        System.out.println("Dog Info:");
        dog.displayInfo();
        dog.makeSound();

        System.out.println("\nCat Info:");
        cat.displayInfo();
        cat.makeSound();
    }
}