package com.problems;

import java.util.Scanner;

/**
 * Print a V shape pattern
 *   *   *
 *    * *
 *     *
 */
public class VPatternExample {
    public static void main(String[] args){
        String pattern;
        int noOfLines;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the pattern to print :::");
        pattern = scanner.nextLine();

        System.out.println("Enter number of times it should get printed : ");
        noOfLines = scanner.nextInt();

        int spaceBeforePattern = 0;
        int spaceAfterPattern = 2 * noOfLines - 3;

        System.out.println();

        for (int i = 1; i <= noOfLines; i++){

            for (int j = 1; j <= spaceBeforePattern; j++){
                System.out.print(" ");
            }
            System.out.print(pattern);
            for(int k = 1; k <= spaceAfterPattern; k++){
                System.out.print(" ");
            }
            if(i < noOfLines){
                System.out.print(pattern);
            }
            System.out.println();
            spaceAfterPattern = spaceAfterPattern - 2;
            spaceBeforePattern = spaceBeforePattern + 1;
        }
    }
}
