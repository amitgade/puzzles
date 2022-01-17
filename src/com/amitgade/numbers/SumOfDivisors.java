package com.amitgade.numbers;

public class SumOfDivisors {

    public static void main(String[] args) {
        int num = 12;
        int sum = 0;

        if (num > 0 && num <= 100) {
//            sum = bruteForce(num, sum);
            sum = optimised(num, sum);
            System.out.println("Number: " + num + ", Sum of Divisor(s): " + sum);
        } else {
            System.out.println("Number:" + num + " is out of range");
        }
    }

    private static int bruteForce(int num, int sum) {
        sum = num;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private static int optimised(int num, int sum) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum = sum + i + num / i;
            }
        }
        return sum;
    }
}

//1 2 3 4 6 12