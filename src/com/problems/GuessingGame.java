package com.problems;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int computerNumber = (int)(Math.random()*100+1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while(userAnswer != computerNumber){
//            String response = JOptonPane.showInputDialog(null, "enter a guess between" +
//                    "1 and 100", "Guessing Game", 3);

            // JoptionPane.showMessageDialog(null, determineGuess(userAnswer, computerNumber, count));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number between 1 to 100!");
            int response = scanner.nextInt();
            userAnswer = response;
            String result = determineGuess(userAnswer, computerNumber, count);
            System.out.println(result);
            count++;
        }
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if(userAnswer <= 0 || userAnswer > 100){
            return "Your guess is invalid.";
        }
        else if(userAnswer == computerNumber){
            return "Correct!\n Total Guesses: "+ count;
        } else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again. \n Try Number : "+ count;
        } else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again. \n Try Number : "+ count;
        }else {
            return "your guess is incorrect \n Try Number: " + count;
        }
    }

}
