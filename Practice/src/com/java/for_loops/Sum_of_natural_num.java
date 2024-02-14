package com.java.for_loops;

import java.util.Scanner;

public class Sum_of_natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print the sum of the first 10 natural numbers.
			System.out.println("enter the value of n :");
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int sum=0;
			
			for(int i=0;i<=n;i++) {
				sum=sum+i;
			}
			System.out.println(sum/n+" "+sum);
			sc.close();
	}

}
