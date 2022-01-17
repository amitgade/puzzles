package com.amitgade.numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter num of terms in Fibonacci : " + "\t");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        System.out.print("Fibonacci Series : " + "\t");
        FibonacciSeries.printFibonacci(terms);
    }

    public static void printFibonacci(int terms) {
        int i = 0;
        int j = 1;
        int k = 0;

        for (int count = 0; count < terms; count++) {
            k = i + j;
            i = j;
            j = k;

            System.out.print(k + " ");
        }
    }
}
