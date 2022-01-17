package com.amitgade.numbers;

class ZeroTrimmer {
    public static void main(String[] args) {
        int num = 1003080;
        System.out.println("Before trim : " + num);

        System.out.println("After trim  : " + trimZeros(num));
    }

    // BruteForce : Convert number to String and use regex to trim 0

    // Algorithmic :
    private static int trimZeros(int num) {

        int pos = 1;

        int remainder = num % 10;
        int newnum = 0;
        while (num != 0) {
            if (remainder != 0) {
                newnum = newnum + pos * remainder;
                pos = pos * 10;
            }
            num = num / 10;
            remainder = num % 10;
        }
        return newnum;
    }

}
