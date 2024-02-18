package com.apieceofcoding.lecture19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest {
    public static void main(String[] args) {
        /**
            요소 추가 4.536초
            요소 접근 0.0초
            요소 수정 0.0초
            요소 삭제 0.237초
         */
        List<String> names = new ArrayList<>();
        /**
             요소 추가 16.998초
             요소 접근 1.107초
             요소 수정 0.705초
             요소 삭제 0.309초
         */
//        List<String> names = new LinkedList<>();
        test(names);
    }

    private static void test(List<String> names) {
        // 요소 추가
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000_000; i++) {
            names.add(i + ""); // 1, 2, 3, 4, 5, ..., 1억
        }

        double elapsed = (System.currentTimeMillis() - start) / 1000.0;
        System.out.println("요소 추가 " + elapsed + "초");

        // 요소 접근
        long start2 = System.currentTimeMillis();

        String name = names.get(50_000_000);
        System.out.println(name);

        double elapsed2 = (System.currentTimeMillis() - start2) / 1000.0;
        System.out.println("요소 접근 " + elapsed2 + "초");

        // 요소 수정
        long start3 = System.currentTimeMillis();

        names.set(50_000_000, "Sam");
        String sam = names.get(50_000_000);
        System.out.println(sam);

        double elapsed3 = (System.currentTimeMillis() - start3) / 1000.0;
        System.out.println("요소 수정 " + elapsed3 + "초");

        // 요소 삭제
        long start4 = System.currentTimeMillis();

        names.remove(50_000_000);

        double elapsed4 = (System.currentTimeMillis() - start4) / 1000.0;
        System.out.println("요소 삭제 " + elapsed4 + "초");
    }
}
