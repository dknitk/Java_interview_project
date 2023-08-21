package com.designpattern_moss.singleton;

/**
 * Singleton Desing Pattern Example
 */
public class KWSingletonDesignPattern {

    // Eager way of instantiating Object
    private static KWSingletonDesignPattern singletonDesignPattern = new KWSingletonDesignPattern();

    private KWSingletonDesignPattern(){

    }

    public static KWSingletonDesignPattern getIntance(){
        synchronized (KWSingletonDesignPattern.class){
            if(singletonDesignPattern == null){
                singletonDesignPattern = new KWSingletonDesignPattern();
            }
        }
        return singletonDesignPattern;
    }

    @Override
    public String toString() {
        return "KWSingletonDesignPattern{" +
                "singletonDesignPattern=" + singletonDesignPattern.hashCode() +
                '}';
    }
}
