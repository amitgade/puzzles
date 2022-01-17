package com.amitgade.javaspecific;

public class TestPuzzle {


    public static boolean checkit(int a, int b) {
        return (a / b) * b + (a % b) == a;
    }

    public static void main(String[] args) {
        System.out.println(TestPuzzle.checkit(11, 3));
        Test test;
    }
}
