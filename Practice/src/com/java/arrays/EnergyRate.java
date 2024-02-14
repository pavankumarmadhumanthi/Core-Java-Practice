package com.java.arrays;

import java.util.Scanner;
import java.util.Vector;

public class EnergyRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int initialvalue=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		int result=initialvalue*time;
		for(int i=1;i<time;i++) {
			result= result+rate*i;
		}
		
		System.out.println(result);
	
		  
	}
	

}
