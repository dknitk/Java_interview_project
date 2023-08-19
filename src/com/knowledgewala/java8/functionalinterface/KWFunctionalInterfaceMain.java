package com.knowledgewala.java8.functionalinterface;
public class KWFunctionalInterfaceMain {
    public static void main(String[] args) {
        KWDefaltStaticExample kwDefaltStaticExample = () -> "abc";
        System.out.println(kwDefaltStaticExample.add(10,20));
        System.out.println(kwDefaltStaticExample.printAbstract());
        System.out.println(kwDefaltStaticExample.concat("Dharmendra", "Sahu"));
        kwDefaltStaticExample.print();

        // Access Static method
        System.out.println(KWDefaltStaticExample.multiply(10,30));
        KWDefaltStaticExample.printHello();


    }
}
