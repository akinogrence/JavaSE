package com.company;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"Osman");
        hashMap.put(2,"Sadet");
        hashMap.put(3,"Akin");
        hashMap.put(4,"Doga");



        for (Map.Entry<Integer,String> entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey() +":"+entry.getValue());
        }
    }
}
