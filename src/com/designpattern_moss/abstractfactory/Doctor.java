package com.designpattern_moss.abstractfactory;

public class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("Doctor Class Instance ....");
    }
}
