package com.company;


import java.util.Scanner;

class Processor extends Thread{

    private volatile boolean running = true;

    public void run(){

        while (running) {
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    }

    public void shutdown()
    {
        running=false;
    }

}


public class Main {



    public static void main(String[] args) {

        Processor processor1 = new Processor();
        processor1.start();

        System.out.println("Thread durdurmak için  tuşa bas.!!");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        processor1.shutdown();





    }
}
