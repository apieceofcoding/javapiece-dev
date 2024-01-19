package com.apieceofcoding.lecture14;

public final class Product {
    int price;

    public Product(int price) {
        this.price = price;
    }

    public void discountPrice(int discountPrice) {
        this.price -= discountPrice;
    }
}