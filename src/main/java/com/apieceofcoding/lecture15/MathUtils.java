package com.apieceofcoding.lecture15;

public class MathUtils {
    public static final double PI;

    static {
        System.out.println("PI 초기화");
        PI = 3.14159265358979;
    }

    // static 메서드
    // 원의 둘레
    public static double circumference(int radius) {
        return 2 * PI * radius;
    }
}
