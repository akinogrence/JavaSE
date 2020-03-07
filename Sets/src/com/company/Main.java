package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");


        System.out.println(set1);

        boolean isContain = set1.contains("dog");
        System.out.println(isContain);

        Set<String> set2 = new HashSet<String>(set1);
        set2.add("giraffe");
        System.out.println(set2);
        set2.removeAll(set1);
        System.out.println(set2);

    }
}
