package com.javabasic;

import java.util.Arrays;

public class PairOfElementsInArray {
    public static void main(String[] args) {
        findPairs(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);

    }

    private static void findPairs(int[] inputArrays, int inputNumber) {
        Arrays.sort(inputArrays);
        System.out.println("Arrays ::" + inputArrays);

        int i = 0;
        int j = inputArrays.length - 1;

        while (i < j) {
            if (inputArrays[i] + inputArrays[j] == inputNumber) {
                System.out.println(inputArrays[i] + " + " + inputArrays[j] + " = "
                        + inputNumber);
                i++;
                j--;
            } else if (inputArrays[i] + inputArrays[j] < inputNumber) {
                i++;
            } else if (inputArrays[i] + inputArrays[j] > inputNumber) {
                j--;
            }
        }
    }
}
