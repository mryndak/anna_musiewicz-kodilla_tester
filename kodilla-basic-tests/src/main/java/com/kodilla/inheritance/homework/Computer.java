package com.kodilla.inheritance.homework;

public class Computer extends OperatingSystem {

    public Computer(int year) {
        super(year);
        System.out.println("Computer construktor");
    }

    @Override
    public void turnOn() {
        System.out.println("Computer is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is turned off");
    }
}