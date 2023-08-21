package com.designpattern_moss.abstractfactory;

public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee){
        if(isTrainee){
            return new TraineeProfessionalAbstractFactory();
        }else {
            return new ProfessionalAbstractFactory();
        }
    }
}
