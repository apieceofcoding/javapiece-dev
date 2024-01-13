package com.apieceofcoding.lecture13;

import java.util.ArrayList;

public class GetterSetter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.getCount());
        counter.increase();
        System.out.println(counter.getCount());

        ArrayList<Object> objects = new ArrayList<>();
        objects.size();
    }
}
