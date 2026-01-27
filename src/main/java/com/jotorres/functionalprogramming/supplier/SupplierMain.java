package com.jotorres.functionalprogramming.supplier;

import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        System.out.println("=== SUPPLIER (no parameters, return something)");
        // Supplier does not receive parameters but return something
        Supplier<Person> personFactory = () -> new Person();

        Person person1 = personFactory.get();
        person1.setFullName("Jorge Torres");
        System.out.println("> Person Name: ".concat(person1.getFullName()));
    }
}
