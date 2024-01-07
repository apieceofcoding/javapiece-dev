package com.apieceofcoding.lecture12.piece;

import com.apieceofcoding.lecture12.coding.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        int count = counter.count;
        System.out.println(count);

        LikesCounter likesCounter = new LikesCounter();
        likesCounter.incrementLikes();
        likesCounter.printLikes();
    }
}
