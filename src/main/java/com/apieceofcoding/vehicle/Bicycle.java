package com.apieceofcoding.vehicle;

class Bicycle extends Vehicle implements HeadLight {
    boolean hasBell;

    Bicycle(int speed, boolean hasBell) {
        super(speed);
        this.hasBell = hasBell;
    }

    @Override
    void start() {
        super.start();
        System.out.println("자전거가 출발합니다.");
    }

    void alarm() {
        if (hasBell) {
            System.out.println("벨을 울립니다.");
        } else {
            System.out.println("(육성) 지나가겠습니다.");
        }
    }

    @Override
    public void turnOn() {
        System.out.println("자전거 전조등을 켭니다.");
    }
}