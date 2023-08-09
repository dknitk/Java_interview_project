package com.javabasic;

import java.util.Scanner;
// Java Program To Reverse A Sentence Word By Word
public class ReverseStringWordByWordProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input String :");

        String inputString = sc.nextLine();

        String outputString = reverseTheSentence(inputString);

        System.out.println("Input String : "+inputString);

        System.out.println("Output String : "+outputString);

        sc.close();
    }

    private static String reverseTheSentence(String str){
        String[] words = str.split("\\s");

        String outputString = "";

        for(int i = words.length - 1; i >= 0; i--){
            outputString = outputString + words[i] + " ";
        }
        return outputString;
    }
}
