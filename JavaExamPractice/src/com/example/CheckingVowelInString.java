package com.example;

public class CheckingVowelInString {
	public static void main(String[] args) {
		String str="apavan";
		String vowel="aeiou";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println("Vowel is founded at : "+i);
				break;
			
			}
		
		}
	}

}
