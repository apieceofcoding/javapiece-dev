package com.apieceofcoding.lecture21;

import java.util.ArrayList;
import java.util.List;

// Stream
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private static void flatMapV2() {
        List<List<Integer>> twoDimensionNumbers = List.of(
                List.of(1, 2),
                List.of(11, 12, 13),
                List.of(111, 112, 113)
        );

        List<String> moneys = twoDimensionNumbers.stream()
                .flatMap(numbers -> numbers.stream()
                        .map(number -> "$" + number))
                .toList();
        System.out.println(moneys);
    }

    private static void flatMapV1() {
        List<List<Integer>> twoDimensionNumbers = List.of(
                List.of(1, 2),
                List.of(11, 12, 13),
                List.of(111, 112, 113)
        );

        List<String> moneys = new ArrayList<>();
        for (List<Integer> numbers : twoDimensionNumbers) {
            for (Integer number : numbers) {
                moneys.add("$" + number);
            }
        }
        System.out.println(moneys);
    }

    private static void reduceV2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = numbers.stream()
                .reduce(0, (result, number) -> result + number);
        System.out.println(sum);
    }

    private static void reduceV1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void mapV2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> moneys = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> "$" + number)
                .toList();
        System.out.println(moneys);
    }

    private static void mapV1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> moneys = new ArrayList<>();
        for (Integer number : numbers) {
            String money = "$" + number;
            moneys.add(money);
        }
        System.out.println(moneys);
    }

    private static void filterV2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(newNumbers);
    }

    private static void filterV1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                newNumbers.add(number);
            }
        }
        System.out.println(newNumbers);
    }
}
