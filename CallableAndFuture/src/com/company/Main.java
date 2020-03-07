package com.company;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        /*executorService.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int duration = random.nextInt(4000);

                System.out.println("Starting...");

                try {
                    Thread.sleep(duration);
                }
                catch (InterruptedException e){e.printStackTrace();}

                System.out.println("Finished...");
            }
        });

        executorService.shutdown();*/


        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(4000);

                System.out.println("Starting...");

                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Finished...");

                return duration;
            }

        });
        executorService.shutdown();

        try {
            System.out.println("Duration is:" + future.get());
        } catch (InterruptedException e){e.printStackTrace();}
        catch (ExecutionException e){e.printStackTrace();}

    }
}
