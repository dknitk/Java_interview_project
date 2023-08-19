package com.knowledgewala.java8.functionalinterface;

@FunctionalInterface
public interface KWDefaltStaticExample {

    String printAbstract();

    default void print(){
        System.out.println("Hello Default");
    }
    static void printHello(){
        System.out.println("Hello Static Method!!!");
    }
    default int add(int a, int b){
        return a + b;
    }
    default String concat(String str1, String str2){
        return str1 + str2;
    }
    static int multiply(int a, int b){
        return a * b;
    }
}
