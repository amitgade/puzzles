package com.amitgade.numbers;

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number : " + "\t");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is NOT prime");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}