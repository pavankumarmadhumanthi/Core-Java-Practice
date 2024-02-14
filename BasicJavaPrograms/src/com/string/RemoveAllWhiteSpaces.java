package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=32) {
				System.out.print(str.charAt(i));
			}
			
		}

	}

}
