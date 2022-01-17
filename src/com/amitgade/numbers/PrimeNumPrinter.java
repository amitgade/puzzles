package com.amitgade.numbers;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by amit on 2019-06-24
 */
public class PrimeNumPrinter {
    public static void main(String[] args) {
//        printPrimeInGivenRange();
//        printFirstNPrimeNums();
        printPrimeNumsUptoN();
    }

    private static void printPrimeInGivenRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting Number :");
        int startNumber = scanner.nextInt();
        System.out.println("Enter ending Number :");
        int endNumber = scanner.nextInt();

        StringBuilder primeNumSrting = new StringBuilder();

        /*CODE TO FIND PRIME NUMBERS BETWEEN GIVEN RANGE*/
        for (int i = startNumber; i <= endNumber; i++) {
            int factCount = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    factCount++;
                }
            }
            if (factCount == 1) {
                primeNumSrting.append(i + "" + ", ");
            }
        }
        /* PRINT PRIME NUMBERS BETEEN THE RANGE*/
        System.out.println(primeNumSrting);
    }


    private static void printFirstNPrimeNums() {
        System.out.print("How many prime nums you want to print : ");
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int count = 0;
        int num = 2;
        while (count != N) { // while count!= number of prime numbers entered keep searching..
            boolean prime = true;// to determine whether the number is prime or not
            for (int i = 2; i <= Math.sqrt(num); i++) { //efficiency matters
                if (num % i == 0) {
                    prime = false; // if number divides any other number its not a prime so set
                    // prime to false and break the loop.
                    break;
                }
            }
            if (prime) {
                count++;
                System.out.print(num + " ");
            }
            num++;
            // see if next number is prime or not.
        }
    }

    private static void printPrimeNumsUptoN() {

        System.out.print("Upper Limit to prime number : ");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        LinkedList<Integer> primeList = new LinkedList<>();

        primeList.add(2);

        for (int i = 2; i <= num; i++) {

            boolean primeFlag = true;

            for (Integer primeNum : primeList) {
                if (i % primeNum == 0) {
                    primeFlag = false;
                    break;
                }
            }

            if (primeFlag) {
                primeList.add(i);
            }
        }

        for (Integer integer : primeList) {
            System.out.print(integer + " ");
        }
    }
}