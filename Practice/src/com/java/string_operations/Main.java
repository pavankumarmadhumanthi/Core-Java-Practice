package com.java.string_operations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of hours in integer :");
		int hours=sc.nextInt();
		int days=hours/24;
		int hourss=hours%24;
		System.out.println( hours+" hours is equal to "+days+" day and "+hourss+" hours.");

	}

}
