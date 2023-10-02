package com.apieceofcoding.vehicle;

abstract class AbstractVehicle {
    int speed;

    AbstractVehicle(int speed) {
        this.speed = speed;
    }

    abstract void start();
}