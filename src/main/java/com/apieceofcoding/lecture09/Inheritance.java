package com.apieceofcoding.lecture09;

import java.util.List;

public class Inheritance {
    public static void main(String[] args) {
        Vehicle electricCar = new ElectricCar("테슬라", 5000, 90);
        Vehicle car = new Car("현대", 10000, 80);

        List<Vehicle> vehicles = List.of(electricCar, car);
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
