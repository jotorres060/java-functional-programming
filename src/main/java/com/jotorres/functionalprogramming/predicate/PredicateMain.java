package com.jotorres.functionalprogramming.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        System.out.println("=== PREDICATE & BIPREDICATE (boolean expressions)");
        // Predicate and BiPredicate evaluate boolean expressions
        // One parameter
        Predicate<Integer> isEven = (Integer number) -> (number % 2 == 0);
        // Two parameters
        BiPredicate<String, Integer> isSameLength = (String word, Integer length) -> (word.length() == length);

        Integer evenNumber = 16;
        System.out.println("> Is Even?: " + isEven.test(evenNumber));

        String word = "Java";
        Integer wordLength = 4;
        System.out.println("> Is Same Length?: " + isSameLength.test(word, wordLength));
    }
}
