package com.jotorres.functionalprogramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("=== STREAMS");

        System.out.println("> Numbers");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> streamNumbers = numbers.stream();
        streamNumbers.forEach(System.out::println);

        System.out.println("\n> Programming Languages");
        Stream<String> programmingLanguages = Stream.of("Java", "Python", "JavaScript");
        programmingLanguages.forEach(System.out::println);

        System.out.println("\n> Fruits");
        String[] fruits = {"Apple", "Pineapple", "Pear"};
        Stream<String> streamFruits = Arrays.stream(fruits);
        streamFruits.forEach(System.out::println);

        System.out.println("\n> Favorite Technology");
        Stream<String> favoriteTech = Stream.generate(() -> "Artificial Intelligence (AI)").limit(3);
        favoriteTech.forEach(System.out::println);

        System.out.println("\n> Longest Names");
        Stream<String> longestNames = Stream.of("Camila", "Ann", "Jorge", "Ryan", "Scott");
        longestNames.filter((name) -> name.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
