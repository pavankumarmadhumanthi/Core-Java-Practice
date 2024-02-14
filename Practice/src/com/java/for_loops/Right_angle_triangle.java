package com.java.for_loops;

import java.util.Scanner;

public class Right_angle_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of Square :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("#"+" ");
			}
			System.out.println(" ");
		}

		sc.close();
	

	}

}
