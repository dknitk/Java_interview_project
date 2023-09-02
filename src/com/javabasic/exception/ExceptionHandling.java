package com.javabasic.exception;

public class ExceptionHandling {

    public static void main(String[] args){
        try{
            NumberFormatException ex = new NumberFormatException("NumberFormatException");
            ex.initCause(new NullPointerException("NullpointerException"));
            throw ex;
        }catch (NumberFormatException ex){
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}
