package com.java.string_operations;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pavan Kumar Madhumanthi";
		char[] name= new char[str.length()];
		for(int i=0;i<str.length();i++) {
			name[i]=str.charAt(i);
		}
		String str1="";
		for(int i=name.length-1;i>=0;i--) {
			str1= str1+name[i];
		}
		System.out.println(str1);
	}

}
