package com.string;

import java.util.Scanner;

public class StringPalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.next();
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println("Given String is not palindrone"+" "+ str);
				break;
			}else {
				System.out.println("Given string is a palindrone"+ " "+str);
			}
		}

	}

}
