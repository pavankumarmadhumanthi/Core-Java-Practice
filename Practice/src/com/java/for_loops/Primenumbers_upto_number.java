package com.java.for_loops;

import java.util.Scanner;

public class Primenumbers_upto_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				int flag=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						flag=flag+1;
					}
				}
				if(flag<=2) {
					System.out.println(i);
				}
				
			}

	}

}
