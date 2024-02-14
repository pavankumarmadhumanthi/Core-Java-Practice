package com.string;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		String str=sc.next();
		int n=Integer.parseInt(str);
		int sum=0,rem=1;
		int t=n;
		while(n>0) {
			rem=n%10;
			sum=sum+(int)Math.pow(rem,str.length());
			n=n/10;
		}
		if(sum==t) {
			System.out.println("Given number is amstrong number" +sum);
		}else {
			System.out.println("Given number is not amstrong number"+t);
		}
	}

}
