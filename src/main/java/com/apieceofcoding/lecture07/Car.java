package com.apieceofcoding.lecture07;

public class Car {
    String name;
    int mileage;

    Car() {}

    // 주 생성자
    Car(String name, int mileage) {
        if (name.isEmpty()) {
            System.out.println("이름을 채워주세요.");
        }
        this.name = name;
        this.mileage = mileage;
    }

    // 부 생성자
    Car(String name) {
        this(name, 100);
    }
}
