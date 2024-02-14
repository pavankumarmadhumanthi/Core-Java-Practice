package com.string;

import java.util.Scanner;

public class NoofVowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		String vowels="aeiou";
		int value=0;
		
		for(int i=0;i<str.length();i++) {
			if(vowels.contains(str.charAt(i)+"")) {
				value=value+1;
			}
		}
		System.out.println("The no of vowels in given String : "+ value);
	}

}
