// Abstract class Shape.java
abstract class Shape {
    // Instance variables for dimensions
    protected double dim1;
    protected double dim2;

    // Constructor to initialize dimensions
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to calculate area
    public abstract double area();
}

// Concrete class Rectangle.java
class Rectangle extends Shape {

    // Constructor to initialize dimensions for rectangle
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    // Implementation of the area method for Rectangle
    @Override
    public double area() {
        return dim1 * dim2; // Area of rectangle = length * breadth
    }
}

// Concrete class Triangle.java
class Triangle extends Shape {

    // Constructor to initialize dimensions for triangle
    public Triangle(double base, double height) {
        super(base, height);
    }

    // Implementation of the area method for Triangle
    @Override
    public double area() {
        return 0.5 * dim1 * dim2; // Area of triangle = 0.5 * base * height
    }
}

// Main class to test the shapes
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating a rectangle with length 5 and breadth 10
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Creating a triangle with base 6 and height 8
        Shape triangle = new Triangle(6, 8);
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

