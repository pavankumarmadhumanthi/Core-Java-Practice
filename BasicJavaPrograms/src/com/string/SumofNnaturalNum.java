package com.string;

import java.util.Scanner;

public class SumofNnaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the natural number : ");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of given n natural numbers : "+ sum);
	}

}
