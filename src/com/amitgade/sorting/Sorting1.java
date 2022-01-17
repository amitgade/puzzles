package com.amitgade.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Sorting1 {

    /**
     * Use MergeSort to solve this
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {12, 9, 8};
        int[] b = {1, 3, 19};


        Integer[] c = new Sorting1().sortArray(a, b);
        for (int i = 0; i <= c.length; i++) {
            System.out.print(c[i] + "  ");
        }
    }

    public Integer[] sortArray(int[] a, int[] b) {

        List<Integer> l = new ArrayList<>();

        for (int i : a) {
            l.add(i);
        }

        for (int i : b) {
            l.add(i);
        }
        Collections.sort(l);
        System.out.println(l);
        Integer[] c = new Integer[60];
        return l.toArray(c);
    }

}
