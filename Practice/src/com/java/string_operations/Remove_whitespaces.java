package com.java.string_operations;

public class Remove_whitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pavan kumar madhumathi";
		char[] arr=str.toCharArray();
		//System.out.println(Arrays.toString(arr));
		char[] arr1=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if((char)arr[i]!=32 ) {
				System.out.print(arr[i]);
		
			}
		}
		//System.out.println(arr1);
	}	

	}

