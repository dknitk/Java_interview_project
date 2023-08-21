package com.designpattern_moss.abstractfactory;

public class TraineeProfessionalAbstractFactory extends AbstractFactory{

    @Override
    Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        }else if(typeOfProfession.equalsIgnoreCase("Trainee Engineer")){
            System.out.println("Trainee Engineer Class Instance return...");
            return new TraineeEngineer();
        } else if (typeOfProfession.equalsIgnoreCase("Trainee Teacher")) {
            System.out.println("Trainee Teacher Class Instance return...");
            return new TraineeTeacher();
        }
        return null;
    }
}
