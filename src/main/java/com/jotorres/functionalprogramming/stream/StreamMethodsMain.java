package com.jotorres.functionalprogramming.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsMain {
    public static void main(String[] args) {
        List<String> names = List.of("Jorge", "Camila", "Ryan", "Ann", "James", "Jorge");
        List<Integer> numbers = List.of(1,2,3,4,5);

        System.out.println("=== filter");
        // filter the data
        Stream<String> longestNames = names.stream();
        longestNames.filter((name) -> name.length() >= 5)
                .forEach(System.out::println);

        System.out.println("\n=== map");
        // transform the data
        Stream<Integer> numberStream = numbers.stream();
        numberStream.map((number) -> number * 2)
                .forEach(System.out::println);

        System.out.println("\n=== flatMap");
        // combines the data
        List<List<Integer>> scores = List.of(List.of(1,2,3), List.of(4,5,6));
        scores.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("\n=== distinct & sorted");
        // eliminates duplicates and it sorts the data
        Stream<Integer> uniqueOrdered = Stream.of(5,1,3,3,4,5,2);
        uniqueOrdered.distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n=== toList");
        // converts the stream to list
        List<String> nameList = names.stream()
                .toList();
        System.out.println(nameList);

        System.out.println("\n=== Collectors.toSet");
        // converts the stream to set
        Set<String> nameSet = names.stream()
                .filter((name) -> name.length() >= 5)
                .collect(Collectors.toSet());
        System.out.println(nameSet);

        System.out.println("\n=== count");
        // indicates the number of elements
        long countNames = names.stream()
                .filter((name) -> name.contains("J"))
                .count();
        System.out.println(countNames);

        System.out.println("\n=== reduce");
        // accumulates the values
        int sum = numbers.stream()
                .reduce(0, (result, number) -> result + number);
        System.out.println(sum);
    }
}
