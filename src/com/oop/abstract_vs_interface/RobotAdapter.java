package com.oop.abstract_vs_interface;

public interface RobotAdapter extends PrototypeRobot{

    String robotName = "T-800";

    static void info(){
        System.out.println(robotName + " is installed !!!");
    }

    void fly();

    default void sleep(){
        System.out.println("Sleeping... (default method)");
    }
}
