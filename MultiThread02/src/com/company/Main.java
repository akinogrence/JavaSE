package com.company;


import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private int count = 0;


    public static void main(String[] args) {

        Main main = new Main();
        main.doWork();


    }

    public synchronized void increment() {
        count++;
    }

    public void doWork() {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    increment();
                    System.out.println("Thread 1 çalıştı");
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    increment();
                    System.out.println("Thread 2 çalıştı");
                }
            }
        });


        try {
            t1.start();
            t1.join();
            t2.start();
            ;
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is :" + count);


    }


}
