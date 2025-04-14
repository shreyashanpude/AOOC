// StaticDemo.java
public class StaticDemo {

    // Static variable
    static int staticVar = 10;

    // Static block
    static {
        System.out.println("Static block is executed.");
        staticVar = 20;  // Modify static variable inside static block
        System.out.println("Static variable value in static block: " + staticVar);
    }

    // Static method
    public static void displayStaticVariable() {
        System.out.println("Static variable value in static method: " + staticVar);
    }

    // Main method to run the program
    public static void main(String[] args) {
        System.out.println("Main method is executed.");

        // Accessing static variable directly
        System.out.println("Static variable value in main: " + staticVar);

        // Calling static method
        displayStaticVariable();
    }
}

