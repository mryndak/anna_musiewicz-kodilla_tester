package com.kodilla.inheritance.homework;

public class Mobile extends Computer {

    public Mobile(int year) {
        super(year);
        System.out.println("Mobile constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("Mobile is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Mobile is turned off");
    }
}
