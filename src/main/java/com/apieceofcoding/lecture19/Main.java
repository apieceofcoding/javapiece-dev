package com.apieceofcoding.lecture19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 배열 ArrayList
        // 조회, (마지막에) 추가 O(1)
        // (중간에) 추가, 삭제 O(N)

        // 이중연결리스트 LinkedList
        // 조회 O(N)
        // 추가, 삭제 O(1)

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);

        String first = fruits.getFirst();
        System.out.println(first);

        fruits.set(0, "Green Apple");
        String apple = fruits.getFirst();
        System.out.println(apple);

        fruits.remove("Banana");
        System.out.println(fruits);
    }

    private static void arrayList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);

        String first = fruits.get(0);
        System.out.println(first);

        fruits.set(0, "Green Apple");
        String apple = fruits.get(0);
        System.out.println(apple);

        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
