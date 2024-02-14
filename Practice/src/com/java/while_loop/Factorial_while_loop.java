package com.java.while_loop;

import java.util.Scanner;

public class Factorial_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n :");
		int n=sc.nextInt();
		int factorial=1;
		while(n>0) {
			if(n==0) {
				System.out.println("Factorial of given number is :"+1);
			}
			else {
				factorial=n*factorial;
			}
			n--;
		}
		System.out.println("Factorial of given number is :"+factorial);

	}

}
