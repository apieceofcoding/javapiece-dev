package com.apieceofcoding.lecture12.piece;

import com.apieceofcoding.lecture12.coding.Counter;

public class LikesCounter extends Counter {
    public void incrementLikes() {
        increment();
    }

    public void printLikes() {
        System.out.println("좋아요 " + count);
    }
}
