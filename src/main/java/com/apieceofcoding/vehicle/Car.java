package com.apieceofcoding.vehicle;

class Car extends Vehicle implements HeadLight, Wiper {
    int fuel;

    Car(int speed, int fuel) {
        super(speed);
        this.fuel = fuel;
    }

    boolean hasFuel() {
        return fuel > 0;
    }

    @Override
    void start() {
        super.start();
        System.out.println("엔진을 가동합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("차 전조등을 켭니다.");
    }

    @Override
    public void wipe() {
        System.out.println("와이퍼로 닦습니다.");
    }
}
