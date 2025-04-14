// Area.java
public class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to get the area
    public double getArea() {
        return length * breadth;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim(5.0, 3.5); // Setting length and breadth
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}

