package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {


        ExecutorService executorService= Executors.newCachedThreadPool();

        for (int i =0;i<10;i++)
        {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Connection.getInstance().connect();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
