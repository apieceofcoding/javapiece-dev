package com.apieceofcoding.lecture10;

public class Car extends Vehicle {
    int fuel;

    public Car(String name, int mileage, int fuel) {
        super(name, mileage);
        this.fuel = fuel;
    }

    @Override
    void start() {
        System.out.println("내연차가 출발합니다.");
    }
}
