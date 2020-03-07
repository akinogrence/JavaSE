package com.company;

class Machine {
    public void start() {
        System.out.println("Starting Machine ");
    }
}

interface Plant {

    public void grow();
}

public class Main {

    public static void main(String[] args) {
        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera Starting!");
            }
        };

        machine1.start();


        Plant plant1  = new Plant() {
            @Override
            public void grow() {
                System.out.println("Growing!");
            }
        };
        plant1.grow();
    }




}
