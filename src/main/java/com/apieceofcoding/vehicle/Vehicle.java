package com.apieceofcoding.vehicle;

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("운송수단이 출발합니다.");
    }
}