package com.java.if_else;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of the person: ");
		int age= sc.nextInt();
		if(age>=18) {
			System.out.println("Person is valid for vote");
		}else {
			System.out.println("Not valid for vote");
		}

	}

}
