package com.apieceofcoding.lecture06;

public class Class {
    public static void main(String[] args) {
//        String carName1 = "현대";
//        int carMileage1 = 10000;
//        String carName2 = "기아";
//        int carMileage2 = 20000;
//        System.out.println(carName1 + " " + carMileage1 + "km");
//        System.out.println(carName2 + " " + carMileage2 + "km");

        // 배열
//        String[] carNames = {"현대", "기아", "테슬라", "BMW", "벤츠"};
//        int[] carMileages = {10000, 20000, 5000, 25000, 15000};
//        for (int i = 0; i < 5; i++) {
//            String carName = carNames[i];
//            int carMileage = carMileages[i];
//            System.out.println(carName + " " + carMileage + "km");
//        }

//        Car car = new Car();
//        System.out.println(car.name);
//        System.out.println(car.mileage);
//
//        car.name = "현대";
//        car.mileage = 10000;
//        System.out.println(car.name);
//        System.out.println(car.mileage);
//        System.out.println(car);

        Car[] cars = {
            new Car("현대", 10000),
            new Car("기아", 20000),
            new Car("테슬라", 5000),
            new Car("BMW", 25000),
            new Car("벤츠", 15000)
        };
        for (Car car : cars) {
            System.out.println(car.name + " " + car.mileage + "km");
        }
    }
}
