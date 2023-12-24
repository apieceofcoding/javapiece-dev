package com.apieceofcoding.lecture10;

public class ElectricCar extends Vehicle {
    int batteryAmount;

    public ElectricCar(String name, int mileage, int batteryAmount) {
        super(name, mileage);
        this.batteryAmount = batteryAmount;
    }

    @Override
    void start() {
        System.out.println("전기차가 출발합니다.");
    }

    int getBatteryAmount() {
        return batteryAmount;
    }
}
