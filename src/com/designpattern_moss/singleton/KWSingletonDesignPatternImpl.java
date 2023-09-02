package com.designpattern_moss.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class KWSingletonDesignPatternImpl {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {
        // multipleObjectCreation();
        KWSingletonDesignPattern originalObject = KWSingletonDesignPattern.getIntance();
        KWSingletonDesignPattern duplicateObject = KWSingletonDesignPattern.getIntance();

        System.out.println("Original Object Hashcode Value :: " + originalObject.hashCode());
        System.out.println("Duplicate Object Hash Code Value :: " + duplicateObject.hashCode());
        String classNameWithPath = "com.designpattern_moss.singleton.KWSingletonDesignPattern";
        System.out.println("**********************************");
        System.out.println("Break Singleton Design Pattern Using Reflection....");
        System.out.println("Original Object Hashcode Value :: " + originalObject.hashCode());
        System.out.println("Hash code for object created using reflection :: "
                + breakSingletonPatternUsingReflection(classNameWithPath).hashCode());
        System.out.println("**********************************");
        System.out.println("Break Singleton Design Pattern Using Serialization....");
        System.out.println("Original Object Hashcode Value :: " + originalObject.hashCode());
        System.out.println("Hash code for object created using serialization :: "
                + breakSingletonPatternUsingSerialization(originalObject).hashCode());

        System.out.println("**********************************");
        System.out.println("Break Singleton Design Pattern Using Clonable....");
        System.out.println("Original Object Hashcode Value :: " + originalObject.hashCode());
        System.out.println("Hash code for object created using clonable :: "
                + breakSingletonPatternUsingClonable(originalObject).hashCode());

    }

    private static void multipleObjectCreation() {
        for (int i = 0; i < 20; i++) {
            System.out.println(KWSingletonDesignPattern.getIntance());
        }
    }

    /**
     * This method help to create a new object instance using reflection.
     * @param classNameWithPath
     * @return KWSingletonDesignPattern
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    private static KWSingletonDesignPattern breakSingletonPatternUsingReflection(String classNameWithPath) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> singletonClass = Class.forName(classNameWithPath);
        Constructor<KWSingletonDesignPattern> declaredConstructor = (Constructor<KWSingletonDesignPattern>) singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        KWSingletonDesignPattern kwSingletonDesignPattern = declaredConstructor.newInstance();
        return kwSingletonDesignPattern;
    }

    private static KWSingletonDesignPattern breakSingletonPatternUsingSerialization(KWSingletonDesignPattern originalObject) throws IOException, ClassNotFoundException {

        // Serailize Object
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://serializeObject.ser"));
        objectOutputStream.writeObject(originalObject);

        // Deserialize Object
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://serializeObject.ser"));
        KWSingletonDesignPattern brokenObject = (KWSingletonDesignPattern) objectInputStream.readObject();

        return brokenObject;
    }

    private static KWSingletonDesignPattern breakSingletonPatternUsingClonable(
            KWSingletonDesignPattern originalObject) throws CloneNotSupportedException {

        KWSingletonDesignPattern clonedObj = (KWSingletonDesignPattern) originalObject.clone();

        return clonedObj;
    }


}
