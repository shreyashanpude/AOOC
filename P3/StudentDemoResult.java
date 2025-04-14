// Student class (Base class)
class Student {
    // Instance variable to store roll number
    protected int rollNo;

    // Constructor to initialize roll number
    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
}

// Test class (Inherits from Student)
class Test extends Student {
    // Instance variables to store marks for two subjects
    protected int sub1, sub2;

    // Constructor to initialize rollNo and marks for two subjects
    public Test(int rollNo, int sub1, int sub2) {
        super(rollNo); // Calling the constructor of Student class
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}

// Result class (Inherits from Test)
class Result extends Test {
    // Constructor to initialize rollNo and marks for subjects
    public Result(int rollNo, int sub1, int sub2) {
        super(rollNo, sub1, sub2); // Calling the constructor of Test class
    }

    // Method to display the result
    public void displayResult() {
        int total = sub1 + sub2; // Calculate the total marks
        double average = total / 2.0; // Calculate the average marks

        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        // Check if the student has passed or failed
        if (sub1 >= 40 && sub2 >= 40) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}

// Main class to test the program
public class StudentDemoResult {
    public static void main(String[] args) {
        // Creating an object of Result class and initializing with rollNo, marks for two subjects
        Result student = new Result(101, 75, 80);

        // Displaying the result
        student.displayResult();
    }
}

