package com.example;

import java.util.Scanner;

public class PalindromeCheck {
	

	public static boolean isPalindrome(String value) {
		for(int i=0;i<value.length();i++) {
			if(value.charAt(i)!=value.charAt(value.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String value=new Scanner(System.in).next();
		System.out.println(isPalindrome(value)?"palindrome":"not a palindrome");
		
		
		
		
	}

}
