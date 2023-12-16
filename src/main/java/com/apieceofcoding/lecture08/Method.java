package com.apieceofcoding.lecture08;

public class Method {
    public static void main(String[] args) {
        Car car = new Car("현대", 5000);
        car.start();
        car.accelerate(20);
        car.accelerate();
        int speed = car.getSpeed();
        System.out.println(speed);
    }
}
