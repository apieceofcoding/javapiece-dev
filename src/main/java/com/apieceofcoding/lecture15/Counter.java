package com.apieceofcoding.lecture15;

public class Counter {
    // static 변수 (클래스 변수)
    public static int count = 0;

    public Counter() {
        // 생성자가 호출될 때마다 인스턴스 수 증가
        count++;
    }

    public static void main(String[] args) {
        // static 변수 접근
        System.out.println("count: " + Counter.count); // 0

        // 인스턴스 생성
        Counter obj1 = new Counter(); // 1
        Counter obj2 = new Counter(); // 2

        // static 변수는 모든 인스턴스에서 공유되므로 값이 누적됨
        System.out.println("count: " + Counter.count); // 2
    }
}