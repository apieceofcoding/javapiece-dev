package com.apieceofcoding.lecture10;

import java.util.List;

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle car = new Car("현대", 10000, 90);
        Vehicle electricCar = new ElectricCar("테슬라", 5000, 80);

        List<Vehicle> vehicles = List.of(car, electricCar);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.name + " " + vehicle.mileage);
        }
    }
}
