package com.apieceofcoding.piece;

import com.apieceofcoding.coding.Counter;

public class LikesCounter extends Counter {
    public void incrementLikes() {
        increment();
    }

    public void printLikes() {
        System.out.println("좋아요 " + count);
    }
}
