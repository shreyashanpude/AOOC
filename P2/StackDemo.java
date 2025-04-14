// Stack.java
class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed onto stack.");
        } else {
            System.out.println("Stack Overflow. Cannot push " + value);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        } else {
            System.out.println("Stack Underflow. Stack is empty.");
            return -1;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack of size 5

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop an element from the stack
        stack.pop();

        // Peek at the top element of the stack
        System.out.println("Top element is: " + stack.peek());
    }
}

