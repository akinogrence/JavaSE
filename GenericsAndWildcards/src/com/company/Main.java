package com.company;

import javax.crypto.Mac;
import java.util.ArrayList;

class Machine {
    public String toString() {

        return "I am Machine";
    }

    public void start() {
        System.out.println("Machine Started.");
    }
}

class Camera extends Machine {
    public String toString() {

        return "I am Camera";
    }

    public void Snap() {

        System.out.println("Snap!");
    }
}

public class Main {

    public static void main(String[] args) {


        ArrayList<Machine> list1 = new ArrayList<Machine>();
        Machine machine1 = new Machine();
        Machine machine2 = new Machine();
        list1.add(machine1);
        list1.add(machine2);

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        list2.add(camera1);
        list2.add(camera2);

        showList(list2);
        showList2(list1);
        showList3(list1);

    }

    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {

            System.out.println(value);
            value.start();

        }
    }

    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);


        }


    }

    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);




        }


    }


}
