package com.java.Patterns;

public class Swap_numbers { 
	public static void main(String[] args) {
		int a=20;
		int b=23;
		System.out.println("Before swapping"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping"+a+" "+b);
		//swapping using third variable
		/* int a=9;
		 * int b=3
		 * int temp=0;
		 * temp=a;
		 * a=b;
		 * b=temp;
		 * `
		 */
	}

}
