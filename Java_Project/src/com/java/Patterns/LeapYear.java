package com.java.Patterns;

public class LeapYear {
	public static void main(String[] args) {
		int year=2023;
		if((year%4==0 && year%100!=0)|| year%400==0) {
			System.out.println("the entered year is leap year"+year);
			
		}
		else {
			System.out.println("the entered year not leap year");
		}
	}

}
