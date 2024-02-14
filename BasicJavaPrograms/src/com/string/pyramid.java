package com.string;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++){
					System.out.print(" ");
					
				}
			for(int j=1;j<=((i*2)-1);j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	
	


}
