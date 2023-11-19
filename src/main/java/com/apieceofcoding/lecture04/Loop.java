package com.apieceofcoding.lecture04;

public class Loop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i = i + 3) {
//            System.out.println("반복 횟수: " + i);
//        }

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 2; j++) {
//                System.out.println("i: " + i + ", j: " + j);
//            }
//        }

//        int count = 0;
//        while (count < 5) {
//            System.out.println("count: " + count);
//            count = count + 3;
//        }

//        int number = 0;
//        while (true) {
//            if (number >= 5) {
//                break;
//            }
//            System.out.println("숫자: " + number);
//            number++;
//        }

        int x = 0;
        do {
            System.out.println("x: " + x);
            x++;
        } while (x < 5);
    }
}
