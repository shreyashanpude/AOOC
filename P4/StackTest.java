// Stack Interface
interface Stack {
    int size = 5; // Default size of the stack

    // Method to push an element onto the stack
    void push(int value);

    // Method to pop an element from the stack
    int pop();

    // Method to display elements of the stack
    void display();

    // Method to check for overflow condition
    boolean overflow();

    // Method to check for underflow condition
    boolean underflow();
}

// IntegerStack class that implements the Stack interface
class IntegerStack implements Stack {
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public IntegerStack() {
        stackArray = new int[size];
        top = -1; // Initially, the stack is empty
    }

    // Push method to add an element to the stack
    @Override
    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto stack.");
        }
    }

    // Pop method to remove and return the top element of the stack
    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1; // Indicating underflow
        } else {
            return stackArray[top--];
        }
    }

    // Display method to show elements in the stack
    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Check if the stack is full (overflow condition)
    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    // Check if the stack is empty (underflow condition)
    @Override
    public boolean underflow() {
        return top == -1;
    }
}

// Test class to check the working of the IntegerStack class
public class StackTest {
    public static void main(String[] args) {
        // Create an instance of IntegerStack
        IntegerStack stack = new IntegerStack();

        // Test the push method
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack contents
        stack.display();

        // Try pushing to a full stack (overflow)
        stack.push(60); // This will cause an overflow

        // Test the pop method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display the stack contents after popping
        stack.display();

        // Try popping from an empty stack (underflow)
        stack.pop();
        stack.pop();
        stack.pop(); // This will cause an underflow

        // Display the stack contents again
        stack.display();
    }
}

