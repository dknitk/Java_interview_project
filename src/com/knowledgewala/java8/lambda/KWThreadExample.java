package com.knowledgewala.java8.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KWThreadExample {

    public static void main(String[] args) {
        KWthread1 kWthread1 = new KWthread1();

        // Normal Way of Thread Execution
        Thread thread1 = new Thread(kWthread1);
        thread1.start();

        // Async Way of Thread Execution
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i < 1000; i++){
                    System.out.println("My Run Method Asynchronous :: " + i);
                }
            }
        });
        thread2.start();

        // Lambda Way of Thread Execution
        Thread thread3 = new Thread(() -> {
            for(int i = 1; i < 1000; i++){
                System.out.println("My Run Method Lambda :: " + i);
            }
        });
        thread3.start();

        // ExecutorService Example
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executor Service Example");
            }
        });
        executorService.shutdown();

        // Fixed Thread Pool
        executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executor Service Example");
            }
        });
        executorService.shutdown();
    }

}

class KWthread1 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i < 1000; i++){
            System.out.println("My Run Method :: " + i);
        }
    }
}
