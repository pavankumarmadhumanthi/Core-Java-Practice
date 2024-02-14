package com.string;

import java.util.Scanner;

public class RemoveOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.next();
		System.out.println("Enter the character to be removed from the String : " );
		char ch=sc.next().charAt(0);
		boolean value=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch) {
				System.out.println(str.charAt(i));
			}
			
		}

	}

}
