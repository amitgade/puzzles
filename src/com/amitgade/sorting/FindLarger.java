package com.amitgade.sorting;

public class FindLarger {
    /*CODE TO FIND LARGER NUM WITHOUT USING TEMP VARIABLE*/
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        FindLarger fl = new FindLarger();
        fl.swapNums();
    }

    public void swapNums() {
        System.out.println("a=" + a + " ::: b=" + b);

        a = a + b;//a=30,b=20
        b = a - b;//a=30,b=10
        a = a - b;//a=20,b=10

        System.out.println("a=" + a + " ::: b=" + b);
    }
}
