package org.vincent;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Stack Test ===");
        Stacky<Integer> stack = new Stacky<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        stack.push(40);
        stack.push(50);
        stack.printStack();

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("\n=== Queue Test ===");
        Queuey<Integer> queue = new Queuey<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.printQueue();

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
