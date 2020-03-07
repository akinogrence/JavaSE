package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fis = new FileInputStream("people.bin")) {
            ObjectInputStream os = new ObjectInputStream(fis);

            //Person tmpPerson1 = (Person) os.readObject();
            //System.out.println(tmpPerson1);
            //Person tmpPerson2 = (Person) os.readObject();
            //System.out.println(tmpPerson2);

            Person[] people = (Person[]) os.readObject();

            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for (Person person : peopleList) {
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}