package com.apieceofcoding.lecture07;

public class Constructor {
    public static void main(String[] args) {
//        Car car = new Car();
//        System.out.println(car);
//
//        car.name = "현대";
//        car.mileage = 10000;
//        System.out.println(car.name + " " + car.mileage + "km");

//        Car car = new Car();
//        System.out.println(car.name + " " + car.mileage + "km");

        Car car2 = new Car("현대", 10000);
        System.out.println(car2.name + " " + car2.mileage + "km");

        Car car3 = new Car("");
        System.out.println(car3.name + " " + car3.mileage + "km");
    }
}
