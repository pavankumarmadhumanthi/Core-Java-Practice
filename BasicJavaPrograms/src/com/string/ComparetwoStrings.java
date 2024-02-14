package com.string;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ComparetwoStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1 : ");
		String str1=sc.nextLine();
		System.out.println("Enter the string2 : ");
		String str2=sc.nextLine();
		
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)!=str2.charAt(i)) {
					System.out.println("given Strings are not same");
				}
			}
			System.out.println("Given Strings are same");
			
		}else {
			System.out.println("Given strings are not same");
		}
		
	}

}
