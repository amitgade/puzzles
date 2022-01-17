package com.amitgade.patterns;


/**
 * Created by amit on 2019-06-25
 */
public class Pattern6 {
    /**
     * 					1
     * 				1	2	1
     * 			1	2	3	2	1
     * 		1	2	3	4	3	2	1
     * 	1	2	3	4	5	4	3	2	1
     */
    public static void main(String[] args) {

        for (int line = 1; line <= 5; line++) {
            for (int i = 5; i > line; i--) {
                System.out.print("\t");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("\t" + i);
            }
            for (int i = line - 1; i >= 1; i--) {
                System.out.print("\t" + i);
            }

            System.out.println();
        }
    }
}
