package com.java.exam;

import java.util.Scanner;

public class BlastOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer number n ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			if(i==1) {
				System.out.println("Blastoff!");
				break;
				
			}
			System.out.println(i);
		}

	}

}
