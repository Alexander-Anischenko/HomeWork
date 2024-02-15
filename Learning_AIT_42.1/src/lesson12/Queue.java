package lesson12;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work #12
 *
 * @copied from CodeChick.io
 * @version 15-02-24
 */

public class Queue {
    int size = 5;
    int items[] = new int[size];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        }else {
            return  false;
        }
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
        }else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Addet element " + element);
        }
    }
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Element removed " + element);
            return (element);
        }
    }
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Index FRONT -> " + front);
            System.out.println("Elements -> ");
            for (i = front; i <= rear ; i++) {
                System.out.println(items[i] + " ");
            }
            System.out.println("Index REAR -> " + rear);
        }
    }
}
