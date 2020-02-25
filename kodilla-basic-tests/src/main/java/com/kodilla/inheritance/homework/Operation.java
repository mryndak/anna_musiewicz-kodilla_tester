package com.kodilla.inheritance.homework;

public class Operation {
    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1984);
        system.turnOn();
        system.turnOff();

        Computer computer = new Computer(2006);
        computer.turnOn();
        computer.turnOff();

        Mobile mobile = new Mobile(2018);
        mobile.turnOn();
        mobile.turnOff();
    }
}


