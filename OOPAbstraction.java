// Abstract class
abstract class Shape {
    // Abstract methods
    public abstract void draw();
    public abstract void color();
}

// Concrete classes implementing Shape
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void color() {
        System.out.println("Circle is red");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void color() {
        System.out.println("Rectangle is blue");
    }
}

public class OOPAbstraction {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling draw and color methods on Circle and Rectangle objects
        circle.draw();
        circle.color();

        rectangle.draw();
        rectangle.color();
    }
}