package com.apieceofcoding.lecture11;

import java.util.ArrayList;
import java.util.List;

public class Interface {
    public static void main(String[] args) {
        Car car = new Car("현대", 10000, 90);
        car.turnOn();
        car.fillUp(10);
        System.out.println(car.fuel);

        ElectricCar electricCar = new ElectricCar("테슬라", 5000, 80);
        electricCar.turnOn();
        electricCar.charge(20);
        System.out.println(electricCar.batteryAmount);

        String color = HeadLight.COLOR;
        System.out.println(color);

        List<HeadLight> headLights = new ArrayList<>();
        headLights.add(car);
        headLights.add(electricCar);
        for (HeadLight headLight : headLights) {
            headLight.turnOn();
        }
    }
}
