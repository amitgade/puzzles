package com.amitgade.morganstanley;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        try {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println(n1 / n2);
        } catch (InputMismatchException ime) {
            //System.out.println(ime.toString());
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            //System.out.println("java.lang.ArithmeticException: / by zero");
            System.out.println(ae.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        if (N >=2 && N<=20) {
        	for (int i = 1; i <= 10; i++) {
            	System.out.println(N + "\tx\t" + i +"\t=\t" + N*i);
    		}
		}else {
			System.out.println("Valid range is 2 <= N <=20");
		}*/
    }

}
