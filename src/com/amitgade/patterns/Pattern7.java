package com.amitgade.patterns;

/**
 * Created by amit on 2019-06-25
 */
public class Pattern7 {
    /**
     *         1
     *       1 3 1
     *     1 3 5 3 1
     *   1 3 5 7 5 3 1
     * 1 3 5 7 9 7 5 3 1
     *   1 3 5 7 5 3 1
     *     1 3 5 3 1
     *       1 3 1
     *         1
     */
    public static void main(String[] args) {
        int num = 5;

        // row
        for (int i = 1; i <= num; i++) {

            // space for Q-II
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }

            // Q-II
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2) - 1 + " ");
            }

            // Q-I
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((j * 2) - 1 + " ");
            }

            System.out.println();
        }


        // row
        for (int i = num - 1; i > 0; i--) {

            // space for Q-III
            for (int j = num - 1; j >= i; j--) {
                System.out.print("  ");
            }

            // Q-III
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2) - 1 + " ");
            }

            // Q-IV
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((j * 2) - 1 + " ");
            }

            System.out.println();
        }
    }
}
