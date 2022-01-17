package com.amitgade.arraysandstrings;

/**
 * @project simple_challenges
 * @auther amit on 2019-06-19.
 */
public class TestString1 {
    int count;

    public static void main(String[] args) {
        TestString1 test = new TestString1();
        if (test.find("arba ka dabra", 'a', 5)) {
            System.out.println("Perfect match");
        } else
            System.out.println("Does not match");
    }

    public boolean find(String s, char c, int i) {
        for (int cv = 0; cv < s.length(); cv++) {
            if (s.charAt(cv) == c) {
                count++;
            }
        }

        if (count == i)
            return true;
        else
            return false;
    }
}
