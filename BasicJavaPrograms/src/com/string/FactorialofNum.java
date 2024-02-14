package com.string;

import java.util.Scanner;

public class FactorialofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit : ");
		int s=sc.nextInt();
		int fact=1;
		for(int i=s;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of a given number is"+ fact);
	}

}
