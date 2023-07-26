package com.knowledgewala.java8.lambda;

public class KWFunctionalInterfaceImpl {
    public static void main(String[] args) {
        System.out.println("Functional Interface Example!");

        // Lambda Function with two input parameter
        KWFunctionalInterface functionalInterface = (a, b) -> a + b;
        int sum = functionalInterface.add(10,20);
        System.out.println("Sum of two number are ::"+ sum);

        // Lambda Function without input parameter
        KWFunctionalInterfaceNoInput<String> lambdaWithNoInputParameter = () -> "Hello, How are you?";
        String message = lambdaWithNoInputParameter.activity();
        System.out.println("Message is :: "+message);

        // Lambda Function with return only
        lambdaWithNoInputParameter = () -> {
            int a = 10;
            int b = 20;
            return "Sum of two number is :: "+ (a + b);
        };
        String addition = lambdaWithNoInputParameter.activity();
        System.out.println(addition);
    }
}
