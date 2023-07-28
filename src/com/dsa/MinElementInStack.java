package com.dsa;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MinElementInStack {
    private static Stack<Integer> mainStack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();
    public static void main(String[] args) {
        System.out.println("Min Element in the array Example");
        minElement();
        addElement(10);
        minElement();
        addElement(9);
        minElement();
        addElement(4);
        minElement();
        addElement(3);
        minElement();
        addElement(15);
        minElement();
        remeoveElement();
        remeoveElement();
        minElement();
    }

    private static void addElement(int data){
        int min = 0;
        mainStack.push(data);
        if(minStack.isEmpty()) {
            min = data;
        }else{
            min = minStack.peek();
        }
        if(data < min){
            min = data;
        }
        minStack.push(min);
    }
    private static void remeoveElement(){
        if(mainStack.isEmpty()){
            System.out.println("Nothing to remove!");
        }else{
            int data = mainStack.pop();
            minStack.pop();
            System.out.println(data + " Element Deleted!");
        }
    }
    private static void minElement(){
        if(minStack.isEmpty()){
            System.out.println("No Element to display!");
        }else{
            System.out.println("Current Min element in the stack is :: " + minStack.peek());
        }
    }
}
