package com.java.if_else;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||year%400==0) {
			System.out.println("enter given year is leap year");
			
		}else {
				System.out.println("entered number is not leap year!");
		}
		

	}

}
