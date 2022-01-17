package com.amitgade.sorting;

public class Sorting2 {

    public static void main(String[] args) {
        int[] a = {7, 3, 5, 2, 45, 32, 26, 17, 14, 6, 52, 23, 72, 4, 33, 12};

        System.out.println("***********************Before Sorting************************");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                /* DESCENDING ORDER*/
				/*if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}*/

                /* ASCENDING ORDER*/
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

        System.out.println("***********************After Sorting*************************");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
