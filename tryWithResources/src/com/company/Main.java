package com.company;

class Temp implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Closing");
        throw new Exception("OH NO");
    }

}

public class Main {

    public static void main(String[] args) {


        try (Temp temp = new Temp()) {

        } catch (Exception e) {
            System.out.println("Hata :" + e);
        }


    }
}
