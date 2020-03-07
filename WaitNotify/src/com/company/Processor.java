package com.company;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException{
        synchronized (this){
        System.out.println("Producer Thread Running");
        wait();// ilgili threadi durdurup diğer threadlere izin verir !
        System.out.println("Resumed");}
     }

     public void consume() throws InterruptedException{
         Scanner scanner = new Scanner(System.in);
         Thread.sleep(2000);

         synchronized (this){
         System.out.println("Waiting For Return Key");
         scanner.nextLine();
         System.out.println("Return Key Pressed");
         notify();//wait kilidini açar ve diğer threade izin verir !
         Thread.sleep(5000);}
     }
}


