package com.apieceofcoding.lecture05;

public class ArrayString {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//
//        int length = numbers.length;
//        System.out.println(length);

        int[] numbers = {1, 2, 3, 4, 5};
        int value = numbers[2];
        System.out.println(value);

        double[] doubles = {1.5, 2.1, 3.4};
        double aDouble = doubles[2];
        System.out.println(aDouble);

        String greeting = "Hello, World!";
        System.out.println(greeting);
        char c = greeting.charAt(0);
        System.out.println(c);

        String firstName = "John";
        String lastName ="Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 길이
        System.out.println(greeting.length());

        // 비교
        boolean result = firstName.equals(lastName);
        System.out.println(result);

        // 추출
        String text = "Hello, World!";
        String substring = text.substring(7, 12);
        System.out.println(substring);
    }
}
