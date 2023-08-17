package com.dsa.list;

import jdk.dynalink.DynamicLinker;

public class KWDynamicArray {
    int size;
    int capacity = 2;
    Object[] array;

    public KWDynamicArray(){
        this.array = new Object[capacity];
    }
    public KWDynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        System.out.println("Calling add method...");
        if(size > capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){
        System.out.println("Calling insert method...");
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data){
        System.out.println("Calling delete method...");
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                for(int j = 0; j < (size - i -1); j++){
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= capacity/3){
                    shrink();
                }
                break;
            }
        }
    }
    public int search(Object data){
        System.out.println("Calling search method...");
        for(int i = 0;i < size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){
        System.out.println("Calling grow method...");
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink(){
        System.out.println("Calling shrink method...");
        int newCapacity = capacity/2;
        Object[] newArray = new Object[newCapacity];
        for(int i = 0;i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        String str = "";
        for(int i =0; i < size; i++){
            str += array[i] + ", ";
        }
        if(str != ""){
            str = "[ " + str.substring(0, str.length() - 2)+ " ]";
        }else{
            str = "[ ]";
        }
        return str;
    }
}
