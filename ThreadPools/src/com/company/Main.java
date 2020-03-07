package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

 class Processor implements Runnable {

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    public  void run() {

        System.out.println("Starting:" + id);

        try {
            Thread.sleep(2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed:" + id);
    }}


public class Main {



    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executor.submit(new Processor(i));
        }

        executor.shutdown();
        System.out.println("All Task Submitted");


        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All Task completed");

    }
}
