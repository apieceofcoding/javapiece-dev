package com.apieceofcoding.lecture09;

public class Vehicle {
    String name;
    int mileage;
    int speed;

    public Vehicle(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
        this.speed = 0;
    }

    void start() {
        System.out.println(name + " 차량이 출발합니다.");
    }
}
