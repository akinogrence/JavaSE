package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

      /*  String fileName = "/Users/akinogrence/Documents/IdeaProjects/readFile/File.txt";
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);
        System.out.println(in.nextInt());
        int count=2;


        while (in.hasNextLine())
        {
            System.out.println(count +":"+ in.nextLine());
            count++;
        }*/

        String fileName = "/Users/akinogrence/Documents/IdeaProjects/readFile/File.txt";
        File textFile = new File(fileName);
        BufferedReader br=null;
        try {

            FileReader fr = new FileReader(fileName);
             br = new BufferedReader(fr);

            String line ;
           while((line = br.readLine())!= null){
               System.out.println(line);
           }


        } catch (FileNotFoundException e) {
            System.out.println("File not Found" + fileName.toString());
        } catch (IOException E)
        {
            System.out.println("Unable to read file: " + fileName.toString());
        }




        try{br.close();}catch (IOException e){e.printStackTrace();}


    }
}
