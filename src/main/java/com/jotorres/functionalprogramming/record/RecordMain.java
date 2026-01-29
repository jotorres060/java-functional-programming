package com.jotorres.functionalprogramming.record;

public class RecordMain {
    public static void main(String[] args) {
        System.out.println("=== PRODUCT");
        // Record is an immutable class that allows to access to attributes
        // and include methods like equals, hashcode, toString
        // A record is a good way to implement DTOs classes
        ProductDto product = new ProductDto(1L, "MacBook Pro", 1000.0);

        System.out.println("> ID: " + product.id());
        System.out.println("> Name: " + product.name());
        System.out.println("> Price: $" + product.price());
    }
}
