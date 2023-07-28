package com.dsa;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueWithStackExample {

    static Stack<Integer> forwardStack = new Stack<>();
    static Stack<Integer> reverseStack = new Stack<>();

    public static void main(String[] args) {
        System.out.println("Queue Using Stack Example!");
        display();
        enQueue(10);
        enQueue(20);
        enQueue(30);
        display();
        deQueue();
        deQueue();
        display();
    }

    private static void enQueue(int data) {
        if (isFull()) {
            throw new NoSuchElementException();
        }
        try {
            if (forwardStack.isEmpty()) {
                while (!reverseStack.isEmpty()) {
                    forwardStack.push(reverseStack.pop());
                }
            }
            forwardStack.push(data);
            System.out.println(data + " Inserted!");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    private static void deQueue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        try {
            if (reverseStack.isEmpty()) {
                while (!forwardStack.isEmpty()) {
                    reverseStack.push(forwardStack.pop());
                }
            }
            int deleted = reverseStack.pop();
            System.out.println("Element Deleted :: " + deleted);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    private static boolean isFull() {
        if (!forwardStack.isEmpty() && !reverseStack.isEmpty()) {
            return true;
        }
        return false;
    }

    private static boolean isEmpty() {
        if (forwardStack.isEmpty() && reverseStack.isEmpty()) {
            return true;
        }
        return false;
    }

    private static void display() {
        if (isEmpty()) {
            System.out.println("No Element to display");
        } else {
            if (!forwardStack.isEmpty()) {
                for (int element : forwardStack) {
                    System.out.println(element);
                }
            } else if (!reverseStack.isEmpty()) {
                for (int i = reverseStack.size() - 1; i >= 0; i--) {
                    System.out.println(reverseStack.get(i));
                }
            }
        }

    }
}
