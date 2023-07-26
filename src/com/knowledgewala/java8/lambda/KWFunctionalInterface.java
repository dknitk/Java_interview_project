package com.knowledgewala.java8.lambda;

/**
 * This is a sample functional interface.
 */
@FunctionalInterface
public interface KWFunctionalInterface {

    /**
     * This method will help to add two integer number.
     * @param a
     * @param b
     * @return sum of two integer
     */
    int add(int a, int b);

    /**
     * Default method example
     */
    default void showMessage(){
        System.out.println("Hello, How are you?");
    }

    /**
     * Static method example
     */
    static void firstStaticMessage(){
        System.out.println("Hello, First Static Method.");
    }
}
