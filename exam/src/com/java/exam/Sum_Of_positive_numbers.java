package com.java.exam;

import java.util.Scanner;

public class Sum_Of_positive_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a positive integer number n :");
		int n=sc.nextInt();
		int sum=(n*(n+1))/2;
		System.out.println("Sum of numbers from 1 to "+n+" is : "+sum);
	}

}
