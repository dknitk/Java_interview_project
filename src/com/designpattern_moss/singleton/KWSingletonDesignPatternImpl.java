package com.designpattern_moss.singleton;

public class KWSingletonDesignPatternImpl {
    public static void main(String[] args) {
        for(int i = 0; i< 20; i++) {
            System.out.println(KWSingletonDesignPattern.getIntance());
        }
    }
}
