package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.printf("Started\n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e ) {
            e.printStackTrace();
        }

        latch.countDown();
    }


}

public class Main {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);
        //CountdownLatch Not Reusable!
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i=0 ;i<3 ;i++)
        {
            executorService.submit(new Processor(latch));
        }

        try {
            latch.await();
        }
        catch (InterruptedException e){e.printStackTrace();}

        System.out.printf("Completed\n");
        executorService.shutdown();

    }
}
