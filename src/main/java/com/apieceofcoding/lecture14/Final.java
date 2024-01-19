package com.apieceofcoding.lecture14;

public class Final {
    public static void main(String[] args) {
        int price = 10000;

        // 100줄이상 로직
        int newPrice = 9000;
        // 100줄이상 로직

        Product product = new Product(newPrice);
        System.out.println(product.price);
    }
}
