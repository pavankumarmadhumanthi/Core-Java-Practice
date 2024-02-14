package com.string;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		boolean value=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=false;
				System.out.println("given number is not a prime number");
				break;
			}
		}
		if(value) {
			System.out.println("Given number is prime number");
		}
		
	}

}
