package com.java.Patterns;

import java.util.Scanner;

public class Factorial_ofnumber {
	public int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			
			return (num*factorial(num-1));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		Factorial_ofnumber fc = new Factorial_ofnumber();
		int k = fc.factorial(number);
		System.out.println("factorial of given number is:" + k);

	}

}
