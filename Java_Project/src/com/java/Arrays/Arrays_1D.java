package com.java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1D {

	public static void main(String[] args) {
		//array decleration
		int[] arr;
		//array size can declere by declare an object
		//if we want to give size then you must create object
		int[] arr1 = new int[5];
		//arrays store default value of int as [0,0,0,0,0]
		
		
		//array initialization or assign
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			System.out.println("enter element");
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr1,45));
		
		
		

	}

}
