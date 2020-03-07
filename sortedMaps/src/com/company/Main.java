package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        testMap(treeMap);
        System.out.println(treeMap);

    }

    public static void testMap(Map<Integer,String> map)
    {
        map.put(1,"akin");
        map.put(2,"sadet");
        map.put(3,"doga");
        map.put(4,"osman");

        for (Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
