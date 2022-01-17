package com.amitgade.misc;

class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
