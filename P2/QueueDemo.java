// Queue.java
class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    // Method to enqueue (add) an element to the queue
    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            if (front == -1) {
                front = 0;  // First element being enqueued
            }
            queueArray[++rear] = value;
            System.out.println(value + " added to the queue.");
        } else {
            System.out.println("Queue Overflow. Cannot enqueue " + value);
        }
    }

    // Method to dequeue (remove) an element from the queue
    public int dequeue() {
        if (front <= rear) {
            int dequeuedValue = queueArray[front++];
            System.out.println(dequeuedValue + " removed from the queue.");
            return dequeuedValue;
        } else {
            System.out.println("Queue Underflow. Queue is empty.");
            return -1;
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Creating a queue of size 5

        // Enqueue elements to the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue an element from the queue
        queue.dequeue();

        // Peek at the front element of the queue
        System.out.println("Front element is: " + queue.peek());
    }
}

