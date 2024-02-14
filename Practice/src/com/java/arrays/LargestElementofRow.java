package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementofRow {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int[][] sales =  new int[3][4];
	
	for(int i=0;i<sales.length;i++) {
		for(int j=0;j<sales[i].length;j++) {
			
			sales[i][j]=sc.nextInt();
			
		}
		System.out.println(" ");
	}
	
	int[] result=new int[3];

	for(int i=0;i<sales.length;i++) {
		int value=Integer.MIN_VALUE;
		for(int j=0;j<sales[i].length;j++) {
			if(value<sales[i][j]) {
				value=sales[i][j];
			}
		}
		result[i]=value;
	}

	System.out.println(Arrays.toString(result));
	System.out.println(Arrays.deepToString(sales));
	
}
}
