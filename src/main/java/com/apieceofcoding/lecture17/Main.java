package com.apieceofcoding.lecture17;

// static factory method
public class Main {
    public static void main(String[] args) {
        Car car = TeslaCar.getCachedTeslaCar("modelS", 2012);
        System.out.println(car);
    }
}
