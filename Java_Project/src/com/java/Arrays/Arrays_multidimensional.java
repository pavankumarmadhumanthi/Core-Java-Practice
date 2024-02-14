package com.java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new  int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter element");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				int k=arr.length;
				if(j>=(k-1)){
					System.out.print("\n");
					
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
