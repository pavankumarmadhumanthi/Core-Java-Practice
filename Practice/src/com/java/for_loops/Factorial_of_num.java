package com.java.for_loops;

import java.util.Scanner;

public class Factorial_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the value for the n :");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
			
		}
		

	}


