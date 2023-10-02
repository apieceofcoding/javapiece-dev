package com.apieceofcoding.vehicle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class VehicleTest {

    @Test
    void start() {
        Vehicle myCar = new Car(0, 20);
        Vehicle myBicycle = new Bicycle(0, true);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(myCar);
        vehicles.add(myBicycle);

        for (Vehicle vehicle: vehicles) {
            vehicle.start();
        }
    }

    @Test
    void turnOn() {
        List<HeadLight> headLights = new ArrayList<>();
        headLights.add(new Car(0, 20));
        headLights.add(new Bicycle(0, true));

        for (HeadLight headLight: headLights) {
            headLight.turnOn();
        }
    }
}