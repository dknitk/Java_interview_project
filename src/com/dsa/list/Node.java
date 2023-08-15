package com.dsa.list;

import java.util.Comparator;

public class Node <T extends Comparator<T>> {

    private T data;
    private Node next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
