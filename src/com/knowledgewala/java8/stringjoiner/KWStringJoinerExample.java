package com.knowledgewala.java8.stringjoiner;

import java.util.StringJoiner;

public class KWStringJoinerExample {
    public static void main(String[] args) {
        delimiter();
    }

    private static void delimiter() {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Dharmendra");
        stringJoiner.add("Rakesh");
        stringJoiner.add("Mohan");
        stringJoiner.add("Kumar");

        System.out.println(stringJoiner);

        // Delimeter as |
        stringJoiner = new StringJoiner("|");
        stringJoiner.add("Gopal");
        stringJoiner.add("Rajesh");
        stringJoiner.add("Devraj");

        System.out.println(stringJoiner);

        // Delimeter as -
        stringJoiner = new StringJoiner("-");
        stringJoiner.add("Gopal");
        stringJoiner.add("Rajesh");
        stringJoiner.add("Devraj");

        System.out.println(stringJoiner);

        // Delimeter as ~
        stringJoiner = new StringJoiner("~");
        stringJoiner.add("Gopal");
        stringJoiner.add("Rajesh");
        stringJoiner.add("Devraj");

        System.out.println(stringJoiner);

        // Adding Prefix and Suffix
        stringJoiner = new StringJoiner(",", "[","]");
        stringJoiner.add("Gopal");
        stringJoiner.add("Rajesh");
        stringJoiner.add("Devraj");

        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner("-", "[","]");
        stringJoiner1.add("Gopal-1");
        stringJoiner1.add("Rajesh-1");
        stringJoiner1.add("Devraj-1");
        System.out.println(stringJoiner1);

        StringJoiner merge = stringJoiner1.merge(stringJoiner);
        System.out.println(merge);
    }
}
