package com.java.arrays;

import java.util.Scanner;

public class Leaders_of_arry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		max(0,size,arr);
				
			}
	private static void max(int index,int n,int[] arr) {
		if(index!=n) {
			int max=0;
			for(int i=index;i<n;i++) {
				if(arr[i]>max) {
					max=arr[i];	
					index=i+1;
				}
			}
				System.out.print(max);
				max(index,n,arr);
		}
		
	}
	}

	

