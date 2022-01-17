package com.amitgade.patterns;

/**
 * Created by amit on 2019-06-25
 */
public class Pattern3 {
    /**
     *  1
     *  2 3
     *  3 4 5
     *  4 5 6 7
     *  5 6 7 8 9
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= i * 2 - 1; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
