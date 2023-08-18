package com.designpattern.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;

public class LiskovDPTest {
    public static void main(String[] args) {
        System.out.println("Liskov Design Pattern Example");
        List<Vehicle> list = new ArrayList<>();
        list.add(new Car());
        list.add(new MotorCycle());
        list.add(new Bicycle());

        for (Vehicle vehicle : list) {
            System.out.println(vehicle.hasEngine());
        }
    }
}
