package com.apieceofcoding.lecture08;

public class Car {
    String name;
    int mileage;
    int speed;

    public Car(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
        this.speed = 0;
    }

    void start() {
        System.out.println(name + " 차량이 출발합니다.");
    }

    void accelerate(int increase) {
        speed += increase;
        System.out.println("속도가 " + increase + "km/h 증가하여 " + speed + "km/h 입니다.");
    }

    void accelerate() {
        speed += 10;
        System.out.println("속도가 10km/h 증가하여 " + speed + "km/h 입니다.");
    }

    int getSpeed() {
        return speed;
    }
}
