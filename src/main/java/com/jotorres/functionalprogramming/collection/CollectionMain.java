package com.jotorres.functionalprogramming.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        System.out.println("=== forEach");
        List<String> programmingLanguages = Arrays.asList("Java", "Python", "JavaScript");
        programmingLanguages.forEach(System.out::println);

        System.out.println("\n=== removeIf");
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf((number) -> number % 2 == 0);
        System.out.println(numbers);

        System.out.println("\n=== replaceAll");
        List<String> soccerTeams = new ArrayList<>(Arrays.asList("Colombia","England","France"));
        soccerTeams.replaceAll(String::toUpperCase);
        System.out.println(soccerTeams);
    }
}
