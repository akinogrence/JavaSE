package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Starting");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1E8; i++) {

                   /* if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted");
                        break;
                    }*/

                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        thread1.start();
        Thread.sleep(500);
        thread1.interrupt();
        thread1.join();
        System.out.println("Finished");

    }
}
