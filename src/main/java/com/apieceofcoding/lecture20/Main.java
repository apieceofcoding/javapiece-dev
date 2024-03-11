package com.apieceofcoding.lecture20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> names = List.of("Alice", "Bob", "Charlie");
//        List<Integer> scores = List.of(95, 85, 73);
//
//        // O(N)
//        for (int i = 0; i < names.size(); i++) {
//            if ("Alice".equals(names.get(i))) {
//                System.out.println(names.get(i) + ": " + scores.get(i));
//            }
//        }

//        runMap();
        runSet();
    }

    private static void runMap() {
        // 키, 값
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        scores.put("Charlie", 73);

        for (String key : scores.keySet()) {
            Integer value = scores.get(key);
            System.out.println(value);
        }

        Integer removed = scores.remove("Bob");
        System.out.println(removed);

        for (String key : scores.keySet()) {
            Integer value = scores.get(key);
            System.out.println(value);
        }

        Integer aScore = scores.get("Alice");
        System.out.println(aScore);

        if (scores.containsKey("Alice")) {
            System.out.println(scores.get("Alice"));
        }

        Integer alice = scores.get("alice");
        System.out.println(alice);

        Integer a = scores.getOrDefault("alice", 100);
        System.out.println(a);
    }

    private static void runSet() {
        // 중복 없는 값들
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(2);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        if (numbers.contains(3)) {
            System.out.println("3이 존재");
        }
    }
}
