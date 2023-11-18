package com.apieceofcoding.lecture03;

public class Condition {
    public static void main(String[] args) {
        int age = 15;

        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        int score = 75;

        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else {
            System.out.println("D 학점");
        }

        int day = 2;
        // switch expression
        String dayName = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            default -> "기타요일";
        };

        // switch statement
        System.out.println(dayName);
    }
}
