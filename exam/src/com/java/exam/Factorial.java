package com.java.exam;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer number n: ");
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
			
		}
		System.out.println("Factorial of"+n+"is :"+sum);
	}

}
