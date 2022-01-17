package com.amitgade.numbers;

import java.util.Scanner;


public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : " + "\t");
        int num = sc.nextInt();
        System.out.print("Enter Power  : " + "\t");
        int pow = sc.nextInt();
        long sum = CalculatePower(num, pow);
        System.out.println(num + " ^ " + pow + " = " + sum);
    }

    private static long CalculatePower(int num, int pow) {
        long sum = 1;
        for (int i = 1; i <= pow; i++) {
            sum *= num;
        }
        return sum;
    }
}
