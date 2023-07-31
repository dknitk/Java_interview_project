package com.interview;

import java.util.Arrays;

public class SubArraySumEqualtoNum {
    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }
    private static void findSubArray(int[] arr, int num){

        int sum = arr[0];
        int start = 0;

        for(int i = 1; i < arr.length; i ++){

            sum = sum + arr[i];
            while(sum > num && start <= i - 1){
                sum = sum - arr[start];
                start++;
            }
            if(sum == num){
                System.out.println("Continous sub array of "+ Arrays.toString(arr)
                + " whose sum is "+ num + " is ");
                for(int j = start; j <= i; j++ ){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }

    }
}
