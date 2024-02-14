package com.java.if_else;

import java.util.Scanner;

public class Greatest_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of num1:");
		int num1=sc.nextInt();
		System.out.println("enter the value of num2:");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+""+"is the greatest element");
		}
		else {
			System.out.println(num2+""+"is the greatest element");
	}
		sc.close();

	}
	

}
