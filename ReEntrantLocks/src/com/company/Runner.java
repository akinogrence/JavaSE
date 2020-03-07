package com.company;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition =  lock.newCondition();


    private void increment() {

        for (int i = 0; i < 10000; i++) {
            count++;
        }

    }

    public void fistThread() throws InterruptedException {
        lock.lock();
        System.out.println("Thread1 Çalışıyor");
        condition.await();
        System.out.println("Thread1 Devam Ediyor!");
        try {
            increment();
        } finally {
            lock.unlock();
        }


    }

    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();

        System.out.println("Thread2 Çalışıyor!(Devam Etmek İçin Butona Bas)");
        new Scanner(System.in).nextLine();
        System.out.println("Thread2 Devam Ediyor!");
        condition.signal();

        try {
            increment();
        } finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count is : " + count);
    }
}
