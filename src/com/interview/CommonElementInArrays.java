package com.interview;

import java.util.HashSet;
import java.util.Set;
//  Write a Java program to find the intersection of two arrays?
public class CommonElementInArrays {

    public static void main(String[] args) {
        commonElementsInArray();
    }

    private static void commonElementsInArray(){

        String[] str1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] str2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        Set<String> set = new HashSet<>();
        for (int i = 0; i < str1.length; i++){
            for(int j = 0; j < str2.length; j++){
                if(str1[i].equals(str2[j])){
                    set.add(str1[i]);
                }
            }
        }
        System.out.println(set);
    }
}
