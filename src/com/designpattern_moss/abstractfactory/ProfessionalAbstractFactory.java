package com.designpattern_moss.abstractfactory;

public class ProfessionalAbstractFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        }else if(typeOfProfession.equalsIgnoreCase("Engineer")){
            System.out.println("Engineer Class Instance return...");
            return new Engineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            System.out.println("Teacher Class Instance return...");
            return new Teacher();
        }
        return null;
    }
}
