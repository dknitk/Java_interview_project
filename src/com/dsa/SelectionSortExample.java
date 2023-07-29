package com.dsa;

import java.util.Arrays;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {12,4,30,5,32,12,23};
        System.out.println("Before :: "+ Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("After :: " + Arrays.toString(array));
    }
}
