package com.java.while_loop;

import java.util.Scanner;

public class Testcases_using_arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of cases you need to check:");
		int cases=sc.nextInt();
		int[] arr=new int[cases];
		int len=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the value test case"+(i+1));
			arr[i]=sc.nextInt();
		}
		
		int i=0;
		while(len>0) {
			int value=arr[i];
			int sum=1;
			if(value==0) {
				sum=1;
			}
			while(value>=1) {
				sum=sum*value;
				value=value-1;
			}
			System.out.print(sum+" ");
			
			
			i=i+1;
			len=len-1;
		}

	}

}
