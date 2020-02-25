package com.kodilla.inheritance;

import com.kodilla.inheritance.homework.Computer;
import com.kodilla.inheritance.homework.Mobile;
import com.kodilla.inheritance.homework.OperatingSystem;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4,2);
        convertible.turnOnLights();
        convertible.displeyNumberOfSeats();
        System.out.println(convertible.getSeats());
    }
}
