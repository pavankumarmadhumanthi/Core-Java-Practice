package com.java.if_else;

import java.util.Scanner;

public class Roots_quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Quadratic equation is ax^2+bx+2");
		System.out.println("enter the values for a and b :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double root1=0;
		double root2=0;
		if(a!=0) {
			double n= Math.sqrt((b*b)-4*a*2);
			root1=(b+n)/2*a;
			
			System.out.println("root1 is :"+root1);
			root2=(b-n)/2*a;
			System.out.println("root2 is :"+root2);
			
		}
		else {
			System.out.println("a is not equal to Zero :");
		}
	}

}
