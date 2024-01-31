package com.apieceofcoding.lecture16;

public class Library {
    static String name = "판교도서관";

    public static class Book {
        String title = "자바한조각";

        public void show() {
            System.out.println("도서관이름: " + name);
            System.out.println("책이름: " + title);
        }
    }
}
