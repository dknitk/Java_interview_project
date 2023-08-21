package com.designpattern_moss.abstractfactory;

/**
 * Abstract Factory Example
 */
public class KWAbstractFactoryImpl {

    public static void main(String[] args) {
        System.out.println("Abstract Factory Design Pattern");

        AbstractFactory profession = AbstractFactoryProducer.getProfession(true);
        System.out.println(profession.getProfession("Engineer"));
        System.out.println(profession.getProfession("Trainee Engineer"));

        profession = AbstractFactoryProducer.getProfession(false);
        System.out.println(profession.getProfession("Teacher"));
        System.out.println(profession.getProfession("Trainee Engineer"));
    }
}
