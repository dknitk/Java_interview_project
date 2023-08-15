package com.dsa.stack;

public class StackImplementation {
    public static void main(String[] args) throws StackUnderflowException, StackOverflowException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.display();
        int result = stack.pop();
        System.out.println("Element Deleted ::" + result);
        stack.display();

    }
}
