package com.dsa;

import java.util.Arrays;

public class ShellSortExample {
    public static void main(String[] args) {
        int[] array = {12,4,30,5,32,12,23};
        System.out.println("Before :: "+ Arrays.toString(array));
        shellSort(array);
        System.out.println("Before :: "+ Arrays.toString(array));
    }
    private static void insertSort(int[] arr, int startIndex, int increment){
        for(int i = startIndex; i< arr.length; i = i + increment){
            for(int j = Math.min(i + increment, arr.length - 1); j - increment >= 0; j = j - increment){
                if(arr[j] < arr[j - increment]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else {
                    break;
                }
            }
        }
    }

    private static void shellSort(int[] arr){
        int increment = arr.length/2;
        while(increment >= 1){
            for(int startIndex = 0; startIndex < increment; startIndex ++){
                insertSort(arr,startIndex, increment);
            }
            increment = increment / 2;
        }

    }

}
