// Shape Interface
interface Shape {
    // Abstract method to calculate the area of a shape
    double area();
}

// Rectangle Class that implements Shape Interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize the dimensions of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the area() method to calculate the area of the rectangle
    @Override
    public double area() {
        return length * width; // Area of rectangle = length * width
    }
}

// Triangle Class that implements Shape Interface
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize the base and height of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of the area() method to calculate the area of the triangle
    @Override
    public double area() {
        return 0.5 * base * height; // Area of triangle = 0.5 * base * height
    }
}

// Main class to test the functionality
public class ShapeDemo {
    public static void main(String[] args) {
        // Create a Rectangle object with length 5 and width 10
        Shape rectangle = new Rectangle(5, 10);
        // Display the area of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Create a Triangle object with base 6 and height 8
        Shape triangle = new Triangle(6, 8);
        // Display the area of the triangle
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

