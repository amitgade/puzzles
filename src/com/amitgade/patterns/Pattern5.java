package com.amitgade.patterns;

/**
 * Created by amit on 2019-06-25
 */
public class Pattern5 {
    /**
     *  5 6 7 8 9
     *  4 5 6 7
     *  3 4 5
     *  2 3
     *  1
     */
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= i * 2 - 1; j++) {
                System.out.print(" " + j % 10);
            }
            System.out.println();
        }
    }
}
