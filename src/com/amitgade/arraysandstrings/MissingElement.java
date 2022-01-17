package com.amitgade.arraysandstrings;

/**
 * Created by amit on 29-Jun-2019
 * <p>
 * <p>
 * Infrasoft onsite interview
 * <p>
 * Given 2 arrays a,b of length n and n-1 resp; find out an element in 'a' that is absent in 'b'
 * e.g. a = [11,3,11,2]    b = [3,2,11] ->> returns 11
 * Assumptions :
 * duplicates are allowed
 * arrays are unsorted
 */
public class MissingElement {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 2, 90, 7};
        int[] arr2 = {2, 7, 7, 3};

        int num = new MissingElement().findMissingElement(arr1, arr2);
        System.out.println(num);
    }

    public int findMissingElement(int[] a, int[] b) {

        if (Math.abs(a.length - b.length) != 1) {
            return -1;
        }

        int xor = 0;

        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
        }

        for (int i = 0; i < b.length; i++) {
            xor ^= b[i];
        }
        return xor;
    }
}
