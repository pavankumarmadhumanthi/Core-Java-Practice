package com.java.string_operations;

public class Removing_specialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="pavanK kumar@ madhumathi@P";
		 str=str.toLowerCase();
		char[] arr=str.toCharArray();
		
		//System.out.println(Arrays.toString(arr));
		char[] arr1=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(((char)arr[i]<=122 )&&(char)arr[i]>=97) {
				System.out.print(arr[i]);
		
			}
		}
		//System.out.println(arr1);
	}	
	}


