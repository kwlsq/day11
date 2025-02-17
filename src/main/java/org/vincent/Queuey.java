package org.vincent;

class QNode<T> {
    T data;
    QNode<T> next;

    public QNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Queuey<T> {
    private QNode<T> front, rear;
    private int size;

    public Queuey() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        QNode<T> newNode = new QNode<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        QNode<T> current = front;
        System.out.print("Queue (front -> rear): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
