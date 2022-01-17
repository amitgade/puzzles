package com.amitgade.arraysandstrings;

public class StringCode {

	/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		}else if (A.compareTo(B) < 0) {
			System.out.println("No");
		}

        System.out.println(A.substring(0,1).toUpperCase()  + A.substring(1) + " "
        		+ B.substring(0,1).toUpperCase() + B.substring(1));

	}
	*/

    // to determine whether string is palindrome or not
    public static void main(String[] args) {
        String A = "anna";

        if (A.equals(new StringBuilder(A).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
