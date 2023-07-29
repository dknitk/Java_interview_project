package com.dsa;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] array = {12,4,30,5,32,12,23};
        System.out.println("Before :: "+ Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            for(int j = array.length - 1; j >i; j --){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Before :: "+ Arrays.toString(array));
    }
}
