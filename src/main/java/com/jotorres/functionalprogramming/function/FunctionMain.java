package com.jotorres.functionalprogramming.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        System.out.println("=== FUNCTION & BIFUNCTION (return a value)");
        // Function and BiFunction can return a value
        Function<String, Integer> stringLength =  (String word) -> word.length();
        BiFunction<Integer, Integer, String> addTwoNumbers = (Integer num1, Integer num2) -> "Result: " + (num1 + num2);

        String codeAssistant = "Claude Code";
        System.out.println("> String Length (".concat(codeAssistant).concat(")"));
        System.out.println(stringLength.apply(codeAssistant));

        Integer num1 = 40;
        Integer num2 = 30;
        System.out.println("> Add two numbers (" + num1 + " + " + num2 + ")");
        System.out.println(addTwoNumbers.apply(num1, num2));
    }
}
