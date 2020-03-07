package com.company;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private Account acc1 = new Account();
    private Account acc2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void acquireLocks(Lock firstLock, Lock secondLock) {
        while (true) {
            boolean isFirstLockAcquired = false;
            boolean isSecondLockAcquired = false;

            try {
                isFirstLockAcquired = firstLock.tryLock();
                isSecondLockAcquired = secondLock.tryLock();

            } finally {
                if (isFirstLockAcquired && isSecondLockAcquired) {
                    return;
                }
                if (isFirstLockAcquired) {
                    firstLock.unlock();
                }
                if (isSecondLockAcquired) {
                    secondLock.unlock();
                }
            }

            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e){e.printStackTrace();}
        }
    }

    public void firstThread() throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
           acquireLocks(lock1,lock2);
            try {
                Account.transfer(acc1, acc2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }


        }
    }

    public void secondThread() throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            acquireLocks(lock1,lock2);
            try {
                Account.transfer(acc2, acc1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() throws InterruptedException {

        System.out.println("Account 1 balance : " + acc1.getBalance());
        System.out.println("Account 2 balance : " + acc2.getBalance());
        System.out.println("Total balance : " + (acc1.getBalance() + acc2.getBalance()));
    }
}
