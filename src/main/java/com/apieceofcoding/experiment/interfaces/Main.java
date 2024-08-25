package com.apieceofcoding.experiment.interfaces;

public class Main {
    public static void main(String[] args) {
        TestInterface.map.put(1, "a");
        System.out.println(TestInterface.map.get(1));
    }
}
