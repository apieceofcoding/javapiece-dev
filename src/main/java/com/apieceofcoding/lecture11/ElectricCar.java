package com.apieceofcoding.lecture11;

public class ElectricCar extends Vehicle implements HeadLight, Charger {
    int batteryAmount;

    public ElectricCar(String name, int mileage, int batteryAmount) {
        super(name, mileage);
        this.batteryAmount = batteryAmount;
    }

    @Override
    void start() {
        System.out.println("전기차가 출발합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("전기차 전조등을 켭니다.");
    }

    @Override
    public void charge(int electricEnergy) {
        System.out.println("배터리를 충전합니다.");
        this.batteryAmount += electricEnergy;
    }
}
