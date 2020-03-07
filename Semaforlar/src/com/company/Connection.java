package com.company;

import java.util.concurrent.Semaphore;

public class Connection {
    private static Connection instance = new Connection();
    private int connections = 0;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() throws InterruptedException {
        semaphore.acquire();
        try {
            doConnect();
        }
        finally {
            semaphore.release();
        }

    }

        private void doConnect () throws InterruptedException {
            synchronized (this) {
                connections++;
                System.out.println("Current Connections:" + connections);
            }

            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this) {
                connections--;
            }
        }
    }

