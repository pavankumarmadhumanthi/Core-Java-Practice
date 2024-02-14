package com.java.while_loop;

import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to check :");
		int number=sc.nextInt();
		int rem;
		int sum=0;
		int temp=number;
		
		while(number!=0) {
			rem=number%10;
			sum=(int) (sum+Math.pow(rem, 3));
			number=number/10;
			
		}
		if (temp==sum) {
			System.out.println("Given number is Amstrong number");
			
			
		}else {
			System.out.println("Given number is not a Amstrong number");
			
		}

	}

}
