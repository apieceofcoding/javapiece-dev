package com.apieceofcoding.lecture09;

public class Car extends Vehicle {
    int fuel;

    public Car(String name, int mileage, int fuel) {
        super(name, mileage);
        this.fuel = fuel;
    }

    @Override
    void start() {
        super.start();
        System.out.println("내연차가 출발합니다.");
    }
}
