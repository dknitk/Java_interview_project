package com.javabasic;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 7, 4};
        int[] arr2 = {2, 5, 1, 7, 4};

        boolean isArrayEqual = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isArrayEqual = false;
                    break;
                }
            }
        } else {
            isArrayEqual = false;
        }
        if (isArrayEqual) {
            System.out.println("Two given arrays are equals!");
        } else {
            System.out.println("Two given arrays are not equals!");
        }


    }
}
