package org.vincent;

public class Main {
    public static void main(String[] args) {
        Stacky<Integer> stack = new Stacky<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

        stack.push(40);
        stack.push(50);

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}