package com.dsa;

import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] array = {12,4,30,5,32,12,23};
        System.out.println("Before :: "+ Arrays.toString(array));
        for(int i = 0; i < array.length -1; i++){
            for(int j = i+1; j > 0; j--){
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println("Before :: "+ Arrays.toString(array));
    }
}
