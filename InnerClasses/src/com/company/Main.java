package com.company;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(3);
        robot.start();



        Robot.Brain brain = robot.new Brain();
        brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();



}}
