package com.java.while_loop;

import java.util.Scanner;

public class Palindrone {

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
			sum=sum*10+rem;
			number=number/10;
			
		}
		if (temp==sum) {
			System.out.println("Given number is palindrome");
			
			
		}else {
			System.out.println("Given number is not a palindrome");
			
		}
		
		

	}

}
