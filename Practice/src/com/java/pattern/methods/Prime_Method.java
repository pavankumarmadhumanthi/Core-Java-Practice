package com.java.pattern.methods;

import java.util.Scanner;

public class Prime_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("here program is Started");
		for (int i = 1; i <= 1000; i++) {
			int n = isPrime(i);
			if (n == 2) {
				System.out.print(i+" ");
			}

		}

	}

	private static int isPrime(int i) {
		// TODO Auto-generated method stub
		int number = i;
		int flag=0;
			while (number > 0) {
				for(int j=1;j<=number;j++) {
					if(number%j==0) {
						flag=flag+1;
					}
				}
				return flag;
			}
		return flag;
	}
	
}
