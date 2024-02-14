package com.java.if_else;

import java.util.Scanner;

public class Even_odd_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Given number is even number");
		}
		else {
			System.out.println("Given number is odd number");
		}
		sc.close();
	}

}
