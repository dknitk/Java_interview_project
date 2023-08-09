package com.javabasic;

import java.io.File;

public class TextFileOperationExample {
    public static void main(String[] args) {
        String filePath = "D:\\projects\\Idea_workspace\\Java_project\\resource\\file.txt";
        setTextFileReadOnly(filePath);
    }

    private static void setTextFileReadOnly(String filePath){

        File file = new File(filePath);

        boolean result = file.setReadOnly();

        if(result){
            System.out.println("File is now read only.....!");
        }else{
            System.out.println("File is still writable.....!");
        }

        // create Object again
        file = new File(filePath);
        file.setWritable(false);
        if(file.canWrite()){
            System.out.println("Writable....!");
        }else{
            System.out.println("Not Writable....!");
        }
        // set as writable
        file.setWritable(true);
        if(file.canWrite()){
            System.out.println("Writable....!");
        }else{
            System.out.println("Not Writable....!");
        }
    }
}
