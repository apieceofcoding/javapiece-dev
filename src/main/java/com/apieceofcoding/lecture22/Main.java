package com.apieceofcoding.lecture22;

public class Main {

    public static void main(String[] args) {
        Operator add = Operator.ADD;
        add.symbol = "+";

        Operator newAdd = Operator.ADD;
        System.out.println(newAdd.symbol);
    }
}
