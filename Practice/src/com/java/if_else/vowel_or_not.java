package com.java.if_else;

import java.util.Scanner;

public class vowel_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character: ");
		char value=sc.next().charAt(0);
		
		if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u') {
		System.out.println("given character is vowel");
	}
		else {
			System.out.println("the given character is not a vowel");
		}

	}
}

