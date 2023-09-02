package com.designpattern_moss.singleton;

import java.io.Serializable;

/**
 * Singleton Desing Pattern Example
 */
public class KWSingletonDesignPattern implements Serializable, Cloneable {

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
