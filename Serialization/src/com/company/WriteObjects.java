package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {

        System.out.println("Writing Objects...");

       // Person mike = new Person(1,"Mike");
        //Person sue = new Person(2,"Sue");

        Person[] people = {new Person(1,"sue") , new Person(2,"mike")};
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));


       // System.out.println(mike);
        //System.out.println(sue);

        try(FileOutputStream fos = new FileOutputStream("people.bin");) {

            ObjectOutputStream os = new ObjectOutputStream(fos);
           // os.writeObject(mike);
            //os.writeObject(sue);
            os.writeObject(people);
            os.writeObject(peopleList);
            os.close();

        }
        catch (FileNotFoundException e ){e.printStackTrace();}
        catch (IOException e ){e.printStackTrace();}
    }
}
