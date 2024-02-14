package com.string;

import java.util.Scanner;

public class NumofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine().trim();
		int value=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==32) {
				value=value+1;
			}
		}
		System.out.println(value);
		

	}

}
