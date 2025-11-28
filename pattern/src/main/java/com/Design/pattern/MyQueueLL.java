package com.Design.pattern;


public class MyQueueLL {
    private Node front, rear;

    public MyQueueLL() {
        this.front = this.rear = null;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue → add element at rear
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // first element
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Inserted " + data + " into queue");
    }

    // Dequeue → remove element from front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) { // queue became empty
            rear = null;
        }
        return value;
    }

    // Peek → see front element without removing
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Demo
    public static void main(String[] args) {
        MyQueueLL q = new MyQueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // Queue elements: 10 20 30

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // 10
        q.display(); // Queue elements: 20 30
    }
}
