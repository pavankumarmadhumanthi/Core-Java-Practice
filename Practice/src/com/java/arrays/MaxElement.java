package com.java.arrays;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int max=0;
		int min=Integer.MAX_VALUE;
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("enter the element for %d : ",i);
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			if(max<arr[i]) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum element in array : "+max);
		System.out.println("Manimum element in array : "+min);
		System.out.println("Sum of elements in array : "+sum);
		

	}

}
