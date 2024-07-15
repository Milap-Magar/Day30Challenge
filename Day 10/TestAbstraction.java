
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract void draw();
}

// Inherits the abstract class
class Circle extends Shape {
    // Provides implementation for the abstract method
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Cannot instantiate abstract class
        shape.draw(); // Calls the draw method of Circle
    }
}
