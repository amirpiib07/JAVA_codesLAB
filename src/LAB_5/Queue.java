package LAB_5;
import java.util.Scanner;

// Custom exceptions
class QueueOverflowException extends Exception {
    public QueueOverflowException(String msg) { super(msg); }
}

class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String msg) { super(msg); }
}

// Interface
interface QueueImpl {
    void insert(int value) throws QueueOverflowException;
    int  delete()          throws QueueUnderflowException;
    void display();
}

// Class implementing the interface
class QueueDemo implements QueueImpl {
    private int[] queue;
    private int   front, rear, size;
    private static final int MAX = 10;

    public QueueDemo() {
        queue = new int[MAX];
        front = 0;
        rear  = -1;
        size  = 0;
    }

    public void insert(int value) throws QueueOverflowException {
        if (size == MAX)
            throw new QueueOverflowException("Queue Overflow! Max size is " + MAX);
        rear = (rear + 1) % MAX;
        queue[rear] = value;
        size++;
        System.out.println(value + " inserted into queue.");
    }

    public int delete() throws QueueUnderflowException {
        if (size == 0)
            throw new QueueUnderflowException("Queue Underflow! Queue is empty.");
        int value = queue[front];
        front = (front + 1) % MAX;
        size--;
        System.out.println(value + " deleted from queue.");
        return value;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % MAX] + " ");
        }
        System.out.println();
    }
}

// Main program
public class Queue {
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();

        // Normal insertions
        try {
            q.insert(10); q.insert(20); q.insert(30);
            q.insert(40); q.insert(50);
        } catch (QueueOverflowException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        q.display();

        // Deletions
        try {
            q.delete();
            q.delete();
        } catch (QueueUnderflowException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        q.display();

        // Test Overflow -- fill beyond max
        try {
            for (int i = 1; i <= 10; i++) q.insert(i * 100);
        } catch (QueueOverflowException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test Underflow -- empty queue then delete
        QueueDemo emptyQ = new QueueDemo();
        try {
            emptyQ.delete();
        } catch (QueueUnderflowException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}