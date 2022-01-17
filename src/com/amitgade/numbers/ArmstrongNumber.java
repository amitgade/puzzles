package com.amitgade.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // find length of number
        int length = findLengthUsingLogBase10(number);
        // int length = findLengthUsingAlgorithm(number);

        // evaluate if armstrong
        int temp = number;
        int sum = 0;
        int remainder = 0;
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, length);
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println(number + " is " + length + "-digit Armstrong number");
        } else {
            System.out.println(number + " is NOT Armstrong number");
        }
    }

    private static int findLengthUsingLogBase10(int number) {
        return (int) (Math.log10(number) + 1);
    }

    private static int findLengthUsingAlgorithm(int number) {
        int length = 0;
        while (number != 0) {
            length++;
            number = number / 10;
        }
        return length;
    }

    static int power(int n, int r) {
        int i, pow = 1;

        for (i = 1; i <= r; i++)
            pow = pow * n;

        return pow;
    }
}
