package com.interview;

import java.util.Arrays;

//  Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class PairsOfElementsInArray {
    public static void main(String[] args) {

        findPaisOfElements(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findPaisOfElements(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findPaisOfElements(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);

        findPaisOfElements(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
    }
    private static void findPaisOfElements(int[] arr, int num){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i < j){

            if(arr[i] + arr[j] == num){
                System.out.println("Pair is :: "+ arr[i] + " + " + arr[j] + " = " + num);
                i++;
                j--;
            }else if( arr[i] + arr[j] < num){
                i++;
            }else if( arr[i] + arr[j] > num){
                j--;
            }
        }
    }
}
