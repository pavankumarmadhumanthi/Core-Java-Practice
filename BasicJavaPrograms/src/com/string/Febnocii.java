package com.string;

import java.util.Scanner;

public class Febnocii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of series : ");
		int len=sc.nextInt();
		int first=0,second=1,temp=0;
		System.out.print("0 1 ");
		for(int i=1;i<=len-2;i++) {
			temp=first+second;
			System.out.print(temp+" ");
			first=second;
			second=temp;
		}
	}

}
