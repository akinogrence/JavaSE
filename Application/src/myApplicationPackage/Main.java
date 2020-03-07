package myApplicationPackage;

import myApplicationPackage.Objects.*;


public class Main {

    public static float sumFunction(float firstNumber, int secondNumber) {

        float sum = 0;

        sum = firstNumber + secondNumber;

        return sum;
    }

    public static void test(Info info){

        info.showInfo();

    }

    public static void main(String[] args) {


        Machine machine1 = new Machine();
        Camera camera1 = new Camera();



        //UPCASTING
        Machine machine2 = camera1;
        machine2.start();
        ((Camera) machine2).snap();


        //DOWNCASTING
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.snap();
        camera2.start();

        //Machine machine4 = new Machine();
        //Camera camera3 = (Camera) machine4;
        //camera3.start();







    }


}

