// Student Class
class Student {
    private int rollNo;

    // Getter method for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter method for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

// Test Class that inherits Student
class Test extends Student {
    private int sub1;
    private int sub2;

    // Getter methods for marks
    public int getMarks() {
        return sub1 + sub2;
    }

    // Setter methods for marks
    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    // Getter methods to access subject marks
    public int getSub1() {
        return sub1;
    }

    public int getSub2() {
        return sub2;
    }
}

// Sports Interface
interface Sports {
    int sMarks = 10; // Sports marks are a constant value

    // Method to set sports marks (can be extended if needed for dynamic value)
    void setSportsMarks();
}

// Result Class that inherits Test and implements Sports Interface
class Result extends Test implements Sports {

    private int totalMarks;
    private int sportsMarks;

    // Constructor to initialize the rollNo and marks
    public Result(int rollNo, int sub1, int sub2) {
        setRollNo(rollNo);
        setMarks(sub1, sub2);
    }

    // Implementing the setSportsMarks() method from the Sports interface
    @Override
    public void setSportsMarks() {
        this.sportsMarks = sMarks; // Set sports marks (can be modified for dynamic input)
    }

    // Method to calculate and display total marks
    public void displayResult() {
        // Set sports marks
        setSportsMarks();

        // Calculate the total marks
        totalMarks = getMarks() + sportsMarks;

        // Displaying the results
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks in Subject 1: " + getSub1());
        System.out.println("Marks in Subject 2: " + getSub2());
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + totalMarks);
    }
}

// Test Application Class
public class StudentTest {
    public static void main(String[] args) {
        // Create an instance of Result
        Result studentResult = new Result(101, 75, 80);

        // Display the result
        studentResult.displayResult();
    }
}

