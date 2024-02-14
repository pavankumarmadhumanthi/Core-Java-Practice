package com.java.if_else;

import java.util.Scanner;

public class Ternary_opreator_wk {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c=sc.nextInt();
		int value=(a>b&&a>c)?a:b>c?b:c;
		System.out.printf(" %d is the maximun value ",value);
		sc.close();
		
	}

}
