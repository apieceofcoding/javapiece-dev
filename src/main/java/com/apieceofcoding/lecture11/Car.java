package com.apieceofcoding.lecture11;

public class Car extends Vehicle implements HeadLight, FuelDoor {
    int fuel;

    public Car(String name, int mileage, int fuel) {
        super(name, mileage);
        this.fuel = fuel;
    }

    @Override
    void start() {
        System.out.println("내연차가 출발합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("내연차 전조등을 켭니다.");
    }

    @Override
    public void fillUp(int fuel) {
        if (fuel < 0) {
            System.out.println("연료는 0 이상이어야 합니다.");
            return;
        }
        System.out.println("연료를 채웁니다.");
        this.fuel += fuel;
    }
}
