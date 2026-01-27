package com.jotorres.functionalprogramming.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        System.out.println("=== CONSUMER & BICONSUMER(void functions)");
        // Consumer and BiConsumer work with void functions
        // One parameter
        Consumer<String> wordInCapitalLetters = (String word) -> System.out.println(word.toUpperCase());
        // Two parameters
        BiConsumer<String, Integer> toDoActivity = (String activity, Integer times) -> {
            for (int i = 0; i < times; i++) {
                System.out.println(activity);
            }
        };

        String word = "spring boot";
        System.out.println("> Word in capital letters: (".concat(word).concat(")"));
        wordInCapitalLetters.accept(word);

        String activity = "To eat";
        Integer times = 3;
        System.out.println("\n> To do an activity ".concat(times.toString()).concat(" times"));
        toDoActivity.accept(activity, times);
    }
}
