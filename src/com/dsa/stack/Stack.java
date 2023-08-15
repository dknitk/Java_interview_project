package com.dsa.stack;

import com.dsa.list.Node;

public class Stack<T> {
    private static int MAX_SIZE = 40;
    private Element<T> top;
    private int size = 0;

    public void push(T data) throws StackOverflowException {
        if(size == MAX_SIZE){
            throw new StackOverflowException();
        }
        Element element = new Element(data, top);
        top = element;
        size++;
    }

    public T pop() throws StackUnderflowException {
        if(size == 0){
            throw new StackUnderflowException();
        }
        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() throws StackUnderflowException {
        if(size == 0){
            throw new StackUnderflowException();
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == MAX_SIZE;
    }

    public int getSize(){
        return size;
    }

    public void display(){
        Element curr = top;
        if(curr == null){
            System.out.println("No Element to display!");
        }else{
            while(curr != null){
                System.out.print(curr.getData() + " ");
                curr = curr.getNext();
            }
        }
        System.out.println();
    }
}
