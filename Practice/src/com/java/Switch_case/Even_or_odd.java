package com.java.Switch_case;

import java.util.Scanner;

public class Even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value for N to check even or odd ");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int result=value%2;
		switch(result) {
		case 0:
			System.out.println("given number is even ");
			break;
		default:
			System.out.println("Given number is odd number");
		
		
		}

	}

}
