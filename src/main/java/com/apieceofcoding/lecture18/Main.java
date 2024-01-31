package com.apieceofcoding.lecture18;

// Builder Pattern
public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Toyota", "Camry", 2022);
        Car car = Car.builder()
                .model("Camry")
                .brand("Toyota")
                .year(2022)
                .build();

        System.out.println(car);
    }
}
