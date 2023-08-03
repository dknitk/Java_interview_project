package com.interview;

import java.util.Arrays;

public class ArrayRotationExample {
    public static void main(String[] args) {
        leftRotation(new int[] {1,2,3,4,5,6,7}, 2);

        rightRotation(new int[] {1,2,3,4,5,6,7}, 2);
    }
    private static void leftRotation(int[] arr, int n){

        System.out.println("Input Array :: "+ Arrays.toString(arr));
        int temp = arr[0];
        for(int i = 0; i < n; i++){
            temp = arr[0];
            for(int j = 0; j < arr.length -1; j++){
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println("Array after left rotation ::"+Arrays.toString(arr));
    }

    private static void rightRotation(int[] arr, int n){
        System.out.println("Input Array :: "+ Arrays.toString(arr));

        int temp;
        for(int i = 0; i < n; i++){
            temp = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j --){
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.println("Array after right rotation ::"+Arrays.toString(arr));
    }
}
