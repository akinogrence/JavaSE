package com.company;

public class Main {

    public static int calculateFactoriel(int deger){


        if(deger==1){return 1;}
        System.out.println(deger);
        return calculateFactoriel(deger-1)*deger;



    }

    public static void main(String[] args) {

        System.out.println(calculateFactoriel(4));
    }


}
