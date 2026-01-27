package com.jotorres.functionalprogramming.calculator;

import com.jotorres.functionalprogramming.interfaces.Operation;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("=== CALCULATOR");
        int number1 = 8;
        int number2 = 4;
        System.out.println("Number1: " + number1 + ", Number2: " + number2 + "\n");

        operateAndPrint("Add", number1, number2, (int num1, int num2) -> (num1 + num2));
        operateAndPrint("Subtract", number1, number2, (int num1, int num2) -> (num1 - num2));
        operateAndPrint("Multiply", number1, number2, (int num1, int num2) -> (num1 * num2));
        operateAndPrint("Divide", number1, number2, (int num1, int num2) -> (num2 > 0) ? (num1 / num2) : 0);
    }

    public static void operateAndPrint(String operationType, int num1, int num2, Operation operation) {
        System.out.println("> " + operationType + " = " + operation.operate(num1, num2));
    }
}
