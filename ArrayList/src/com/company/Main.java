package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);

       /* for(int i=0 ;i <numbers.size();i++){
        System.out.println(numbers.get(i));}

        for (int i : numbers)
        {
            System.out.println(i);
        }
*/
        numbers.remove(1);
        System.out.println(numbers);

    }


}
