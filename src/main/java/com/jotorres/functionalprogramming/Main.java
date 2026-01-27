package com.jotorres.functionalprogramming;

import com.jotorres.functionalprogramming.interfaces.Operation;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FUNCTIONAL OPERATION");
        Operation add = (num1, num2) -> (num1 + num2);
        Operation divide = (num1, num2) -> (num2 > 0) ? (num1 / num2) : 0;

        System.out.println("> Add = " + add.operate(7, 5));
        System.out.println("> Divide = " + divide.operate(12, 4));
    }
}
