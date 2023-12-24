package com.apieceofcoding.lecture10;

public abstract class Vehicle {
    String name;
    int mileage;
    int speed;

    public Vehicle(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
        this.speed = 0;
    }

    abstract void start();

    public int getSpeed() {
        return speed;
    }
}
