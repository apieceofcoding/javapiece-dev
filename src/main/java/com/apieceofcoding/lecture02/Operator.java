package com.apieceofcoding.lecture02;

public class Operator {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int sum = a + b;
//        System.out.println(sum);
//
//        double dividend = 21.0;
//        double divisor = 4.0;
//        double result = dividend / divisor;
//        System.out.println(result);
//
//        int c = 21;
//        int d = 4;
//        int result2 = c / d;
//        System.out.println(result2);
//
//        int e = 21;
//        int f = 4;
//        int result3 = e % f;
//        System.out.println(result3);
//
//        int total = 10;
////        total = total + 5;
//        total += 5;
//        System.out.println(total);


        int a = 0;
        System.out.println(a); // 0
        a = a + 1;
        System.out.println(a); // 1

        int b = 0;
        b = b + 1;
        System.out.println(b); // 1
        System.out.println(b); // 1

        int x = 5;
        int y = 8;
        boolean result = x != y;
        System.out.println(result);


        boolean condition1 = true;
        boolean condition2 = false;
        boolean result2 = condition1 || condition2;
        System.out.println(result2);

        boolean result3 = !condition1;
        System.out.println(result3);

        int age = 18;
        String message = (age >= 18) ? "성인" : "미성년자";
        System.out.println(message);
    }
}
