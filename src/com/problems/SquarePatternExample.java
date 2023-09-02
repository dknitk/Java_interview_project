package com.problems;

import java.util.Scanner;

/**
 * Square Pattern Example
 */
public class SquarePatternExample {
    public static void main(String[] args) {
        System.out.println("Square Pattern Example...");
        String pattern;
        int noOfLines;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the pattern to print :::");
        pattern = scanner.nextLine();

        System.out.println("Enter number of times it should get printed : ");
        noOfLines = scanner.nextInt();

        for(int i = 1; i <= noOfLines; i++){
            for(int j = 1; j <= noOfLines; j++){
                if(i == 1 || i == noOfLines){
                    System.out.print(pattern);
                }else if(j == 1 || j == noOfLines){
                    System.out.print(pattern);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
