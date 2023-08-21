package com.designpattern_moss.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("Doctor Class Instance ....");
    }
}
