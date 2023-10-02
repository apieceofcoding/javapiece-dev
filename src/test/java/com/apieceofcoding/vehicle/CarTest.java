package com.apieceofcoding.vehicle;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void constructor() {
        Car car = new Car(0, 10);
        System.out.println(car.speed);
        System.out.println(car.fuel);
    }
}