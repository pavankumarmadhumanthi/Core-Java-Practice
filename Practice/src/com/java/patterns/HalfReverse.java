package com.java.patterns;

import java.util.Scanner;

public class HalfReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i<=n/2) {
				for(int j=i;j>=1;j--) {
					System.out.print(j);
				}
				System.out.println(" ");
			}
			else {
				
				for(int j=(n+1-i);j>=1;j--) {
				  System.out.print(j);
			}
			System.out.println( );
		}

	}

	}
}
