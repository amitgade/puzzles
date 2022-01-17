package com.amitgade.numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.print("Enter number :" + "\t");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int div = num;
        int mod,pal = 0;

        while (div != 0) {
            mod = div % 10;
            div = div / 10;
            pal = pal * 10 + mod;
        }

        if (pal == num) {
            System.out.println(num + "  is Palindrome");
        } else {
            System.out.println(num + "  is NOT palindrome");
        }
    }

}
