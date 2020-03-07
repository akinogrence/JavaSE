package com.company;

public class Robot {

    private int id ;
    final String  name = "Robert";

    public  class Brain{
        public void think(){
            System.out.println("Robot   " + id + "  is thinking");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start()
    {
        System.out.println( "Robot  "+id+   "    starting!" );
        //Brain brain = new Brain();
        //brain.think();
        class Temp{

            public void doSomething(){
                System.out.println("ID is:   " + id);
                System.out.println("My Name is: " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }

   public static class Battery
    {
        public void charge(){
            System.out.println("Robot Charging.");
        }
    }


}
