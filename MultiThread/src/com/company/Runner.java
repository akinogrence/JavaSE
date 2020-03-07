package com.company;

public class Runner extends Thread {


    public  void run(){

        for(int i =0 ;i<10;i++){

            System.out.println("Döngü Çalisiyor:-" + this.getName());
    }

    }
}
