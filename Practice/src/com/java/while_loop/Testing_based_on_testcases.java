package com.java.while_loop;

import java.util.Scanner;

public class Testing_based_on_testcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of test cases you need to check: ");
		int cases=sc.nextInt();
		while(cases>0) {
			System.out.println("Enter the value to check:");
			int number=sc.nextInt();
			int sum=1;
			if(number==0) {
				sum=1;

			}
			while(number>0) {
				sum=sum*number;
				number--;
			}
			System.out.println(sum);
			
			
			//int fact=factorial(number);
			//System.out.println(fact);
			cases=cases-1;	
		}
	}
	

	private static int factorial(int number) {
		// TODO Auto-generated method stub
		int sum=1;
		while(number>0) {
			sum=sum*number;
			number--;
			if(number==0) {
				return sum;
			}
		}
		return 1;
		
		
	}

}
