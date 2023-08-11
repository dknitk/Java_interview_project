package com.knowledgewala.java8.lambda;

public class MultiplicationTest {
    public static void main(String[] args) {
        System.out.println("Multiplication Example");
        // Normal way
        Multiplication multiplication = new MultiplicationImpl();
        System.out.println("^^^^^Normal Way ^^^^^^"
                + multiplication.multiplication(10,20));

        // Anonymous class
        Multiplication multiplication1 = new Multiplication() {
            public int multiplication(int a, int b) {
                return a * b;
            }
        };
        System.out.println("Anonymous ::" + multiplication1.multiplication(20,30));

        // Lambda Function
        Multiplication multiplication2 = (a, b) -> a * b;
        System.out.println("Lambda Function ***** :: "
                + multiplication2.multiplication(30, 30));
    }
}
