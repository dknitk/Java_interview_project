package com.interview;
// Write a Java program to find a missing number in an integer array?
public class MissingNumberInArray {
    public static void main(String[] args) {

        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int missingNumber = sumOfNumbers(8) - sumOfElements(a);
        System.out.println("Missing Number :: " + missingNumber);
    }

    private static int sumOfNumbers(int n){
        int sum = (n * (n + 1))/2;
        return sum;
    }

    private static int sumOfElements(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
