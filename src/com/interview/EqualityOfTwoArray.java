package com.interview;

import java.util.Arrays;
// Write a Java program to check the equality of two arrays?
public class EqualityOfTwoArray {
    public static void main(String[] args) {
        System.out.println(isArrayEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3}));

        String[] s1 = {"java", "j2ee", "struts", "hibernate"};

        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        System.out.println(Arrays.equals(s1, s2));

        System.out.println(Arrays.equals(s1, s3));

        System.out.println(isArrayEqual(s1, s2));

        System.out.println(isArrayEqual(s1, s3));
    }

    private static boolean isArrayEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isArrayEqual(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
